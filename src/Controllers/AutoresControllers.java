package Controllers;

import Models.Autores;
import Models.AutoresDao;
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
public class AutoresControllers implements ActionListener, MouseListener {

    private Autores au;
    private AutoresDao auDao;
    private PanelPrincipal views;

    DefaultTableModel modelo = new DefaultTableModel();

    public AutoresControllers(Autores au, AutoresDao auDao, PanelPrincipal views) {
        this.au = au;
        this.auDao = auDao;
        this.views = views;
        this.views.btnguardarautor.addActionListener(this);//al boton lo pongo en escucha
        this.views.btneditarautor.addActionListener(this);
        this.views.jMenuEliminarAutores.addActionListener(this);
        this.views.jMenuReingresarAutores.addActionListener(this);
        this.views.btnnuevoautor.addActionListener(this);
        this.views.TableAutores.addMouseListener(this);
        this.views.jMenuEliminarAutoresDefinitivamente.addActionListener(this);
        listarAutores();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnguardarautor) {
            if (views.txtNombreAutor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                au.setAutor(views.txtNombreAutor.getText());
                if (auDao.registrar(au)) {
                    limpiarTable();
                    listarAutores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Autor guardado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.btneditarautor) {
            if (views.txtNombreAutor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                au.setAutor(views.txtNombreAutor.getText());
                au.setIdautor(Integer.parseInt(views.txtIdAutor.getText()));
                if (auDao.modificar(au)) {
                    limpiarTable();
                    listarAutores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Autor modificado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarAutores) {
            if (views.txtIdAutor.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int idautor = Integer.parseInt(views.txtIdAutor.getText());

                if (auDao.accion("0", idautor)) {
                    limpiarTable();
                    listarAutores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Autor deshabilitado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al deshabilitar el autor", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuReingresarAutores) {
            if (views.txtIdAutor.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int idautor = Integer.parseInt(views.txtIdAutor.getText());

                if (auDao.accion("1", idautor)) {
                    limpiarTable();
                    listarAutores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Autor reingresado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el autor", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarAutoresDefinitivamente) {
            if (views.txtIdAutor.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminarlo?", "Atención!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {

                    au.setIdautor(Integer.parseInt(views.txtIdAutor.getText()));

                    if (auDao.eliminar(au)) {
                        limpiarTable();
                        listarAutores();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Autor eliminado correctamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el autor", "Atención!", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (resp == JOptionPane.NO_OPTION) {

                } else if (resp == JOptionPane.CLOSED_OPTION) {
                }
            }
        } else {
            limpiar();
        }

    }

    public void listarAutores() {
        List<Autores> lista = auDao.ListaAutores();//paso la clase Autores y lo almaceno en lista
        modelo = (DefaultTableModel) views.TableAutores.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdautor();
            ob[1] = lista.get(i).getAutor();
            ob[2] = lista.get(i).getEstatus();

            modelo.addRow(ob);
        }
        views.TableAutores.setModel(modelo);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableAutores) {
            int fila = views.TableAutores.rowAtPoint(e.getPoint());//verifico la fila que toco
            views.txtIdAutor.setText(views.TableAutores.getValueAt(fila, 0).toString());//obtengo el id que se encuentra en el indice 0 y lo coloco en el txtIdautor
            views.txtNombreAutor.setText(views.TableAutores.getValueAt(fila, 1).toString());
            views.btnguardarautor.setEnabled(false);
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
        views.txtIdAutor.setText("");
        views.txtNombreAutor.setText("");
        views.btnguardarautor.setEnabled(true);
    }

}
