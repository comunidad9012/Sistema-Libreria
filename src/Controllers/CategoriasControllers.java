package Controllers;

import Models.Categorias;
import Models.CategoriasDao;
import Views.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerald
 */
public class CategoriasControllers implements ActionListener, MouseListener {

    private Categorias ca;
    private CategoriasDao caDao;
    private PanelPrincipal views;
    
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriasControllers(Categorias ca, CategoriasDao caDao, PanelPrincipal views) {
        this.ca = ca;
        this.caDao = caDao;
        this.views = views;
        this.views.btnguardarcategoria.addActionListener(this);
         this.views.btneditarcategoria.addActionListener(this);
        this.views.jMenuEliminarCategorias.addActionListener(this);
        this.views.jMenuReingresarCategorias.addActionListener(this);
        this.views.btnnuevacategoria.addActionListener(this);
        this.views.TableCategoria.addMouseListener(this);
        this.views.jMenuEliminarCategoriasDefinitivamente.addActionListener(this);
        listarCategorias();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnguardarcategoria) {
            if (views.txtNombreCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                ca.setCategoria(views.txtNombreCategoria.getText());
                if (caDao.registrar(ca)) {
                    limpiarTable();
                    listarCategorias();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categoria guardada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.btneditarcategoria) {
            if (views.txtNombreCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                ca.setCategoria(views.txtNombreCategoria.getText());
                ca.setIdcategoria(Integer.parseInt(views.txtIdCategoria.getText()));
                if (caDao.modificar(ca)) {
                    limpiarTable();
                    listarCategorias();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categoria modificada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarCategorias) {
            if (views.txtIdCategoria.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int idcategoria = Integer.parseInt(views.txtIdCategoria.getText());

                if (caDao.accion("0", idcategoria)) {
                    limpiarTable();
                    listarCategorias();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categoria deshabilitada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al deshabilitar la categoria", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuReingresarCategorias) {
            if (views.txtIdCategoria.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int ideditorial = Integer.parseInt(views.txtIdCategoria.getText());

                if (caDao.accion("1", ideditorial)) {
                    limpiarTable();
                    listarCategorias();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categoria reingresada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la categoria", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarCategoriasDefinitivamente) {
            if (views.txtIdCategoria.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminarla?", "Atención!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {

                    ca.setIdcategoria(Integer.parseInt(views.txtIdCategoria.getText()));

                    if (caDao.eliminar(ca)) {
                        limpiarTable();
                        listarCategorias();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Categoria eliminada correctamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar la categoria", "Atención!", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (resp == JOptionPane.NO_OPTION) {

                } else if (resp == JOptionPane.CLOSED_OPTION) {
                }
            }
        } else {
            limpiar();
        }

    }

    public void listarCategorias() {
        List<Categorias> lista = caDao.ListaCategorias();//paso la clase Autores y lo almaceno en lista
        modelo = (DefaultTableModel) views.TableCategoria.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdcategoria();
            ob[1] = lista.get(i).getCategoria();
            ob[2] = lista.get(i).getEstatus();

            modelo.addRow(ob);
        }
        views.TableCategoria.setModel(modelo);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableCategoria) {
            int fila = views.TableCategoria.rowAtPoint(e.getPoint());//verifico la fila que toco
            views.txtIdCategoria.setText(views.TableCategoria.getValueAt(fila, 0).toString());//obtengo el id que se encuentra en el indice 0 y lo coloco en el txtIdautor
            views.txtNombreCategoria.setText(views.TableCategoria.getValueAt(fila, 1).toString());
            views.btnguardarcategoria.setEnabled(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void limpiar() {
        views.txtIdCategoria.setText("");
        views.txtNombreCategoria.setText("");
        views.btnguardarcategoria.setEnabled(true);
    }

}

