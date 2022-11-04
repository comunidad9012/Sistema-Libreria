package Controllers;

import Models.Editoriales;
import Models.EditorialesDao;
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
public class EditorialesControllers implements ActionListener, MouseListener {

    private Editoriales ed;
    private EditorialesDao edDao;
    private PanelPrincipal views;

    DefaultTableModel modelo = new DefaultTableModel();

    public EditorialesControllers(Editoriales ed, EditorialesDao edDao, PanelPrincipal views) {
        this.ed = ed;
        this.edDao = edDao;
        this.views = views;
        this.views.btnguardareditorial.addActionListener(this);/*al boton le agrego el escuchador*/
        this.views.btneditareditorial.addActionListener(this);
        this.views.jMenuEliminarEditoriales.addActionListener(this);
        this.views.jMenuReingresarEditoriales.addActionListener(this);
        this.views.btnnuevaeditorial.addActionListener(this);
        this.views.TableEditoriales.addMouseListener(this);
        this.views.jMenuEliminarEditorialesDefinitivamente.addActionListener(this);
        listarEditoriales();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnguardareditorial) {
            if (views.txtNombreEditorial.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                ed.setEditorial(views.txtNombreEditorial.getText());
                if (edDao.registrar(ed)) {
                    limpiarTable();
                    listarEditoriales();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Editorial guardada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.btneditareditorial) {
            if (views.txtNombreEditorial.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                ed.setEditorial(views.txtNombreEditorial.getText());
                ed.setIdeditorial(Integer.parseInt(views.txtIdEditorial.getText()));
                if (edDao.modificar(ed)) {
                    limpiarTable();
                    listarEditoriales();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Editorial modificada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarEditoriales) {
            if (views.txtIdEditorial.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int ideditorial = Integer.parseInt(views.txtIdEditorial.getText());

                if (edDao.accion("0", ideditorial)) {
                    limpiarTable();
                    listarEditoriales();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Editorial deshabilitado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al deshabilitar la editorial", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuReingresarEditoriales) {
            if (views.txtIdEditorial.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int ideditorial = Integer.parseInt(views.txtIdEditorial.getText());

                if (edDao.accion("1", ideditorial)) {
                    limpiarTable();
                    listarEditoriales();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Editorial reingresada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la editorial", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarEditorialesDefinitivamente) {
            if (views.txtIdEditorial.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminarlo?", "Atención!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {

                    ed.setIdeditorial(Integer.parseInt(views.txtIdEditorial.getText()));

                    if (edDao.eliminar(ed)) {
                        limpiarTable();
                        listarEditoriales();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Editorial eliminada correctamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar la editorial", "Atención!", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (resp == JOptionPane.NO_OPTION) {

                } else if (resp == JOptionPane.CLOSED_OPTION) {
                }
            }
        } else {
            limpiar();
        }

    }

    public void listarEditoriales() {
        List<Editoriales> lista = edDao.ListaEditoriales();//paso la clase Autores y lo almaceno en lista
        modelo = (DefaultTableModel) views.TableEditoriales.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdeditorial();
            ob[1] = lista.get(i).getEditorial();
            ob[2] = lista.get(i).getEstatus();

            modelo.addRow(ob);
        }
        views.TableEditoriales.setModel(modelo);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableEditoriales) {
            int fila = views.TableEditoriales.rowAtPoint(e.getPoint());//verifico la fila que toco
            views.txtIdEditorial.setText(views.TableEditoriales.getValueAt(fila, 0).toString());//obtengo el id que se encuentra en el indice 0 y lo coloco en el txtIdautor
            views.txtNombreEditorial.setText(views.TableEditoriales.getValueAt(fila, 1).toString());
            views.btnguardareditorial.setEnabled(false);
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
        views.txtIdEditorial.setText("");
        views.txtNombreEditorial.setText("");
        views.btnguardareditorial.setEnabled(true);
    }

}
