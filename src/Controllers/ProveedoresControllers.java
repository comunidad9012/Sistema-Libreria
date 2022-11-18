package Controllers;

import Models.Proveedores;
import Models.ProveedoresDao;
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
 * @author lenovo
 */
public class ProveedoresControllers implements ActionListener, MouseListener {

    private Proveedores pr;
    private ProveedoresDao prDao;
    private PanelPrincipal views;

    DefaultTableModel modelo = new DefaultTableModel();

    public ProveedoresControllers(Proveedores pr, ProveedoresDao prDao, PanelPrincipal views) {
        this.pr = pr;
        this.prDao = prDao;
        this.views = views;
        this.views.btnguardarproveedor.addActionListener(this);/*al boton le agrego el escuchador*/
        this.views.btneditarproveedor.addActionListener(this);
        this.views.jMenuEliminarProveedores.addActionListener(this);
        this.views.jMenuReingresarProveedores.addActionListener(this);
        this.views.btnnuevoproveedor.addActionListener(this);
        this.views.TableProveedor.addMouseListener(this);
        this.views.jMenuEliminarProveedoresDefinitivamente.addActionListener(this);
        listarProveedores();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnguardarproveedor) {
            if (views.txtNombreProveedor.getText().equals("")
                    || views.txtTelefono.getText().equals("")
                    || views.txtDireccion.getText().equals("")
                    || views.txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                pr.setProveedor(views.txtNombreProveedor.getText());
                pr.setTelefono(views.txtTelefono.getText());
                pr.setDireccion(views.txtDireccion.getText());
                pr.setCorreo(views.txtEmail.getText());
                pr.setObservaciones(views.txtObservaciones.getText());
                if (prDao.registrar(pr)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor guardado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.btneditarproveedor) {
            if (views.txtNombreProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo es obligatorio", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                pr.setProveedor(views.txtNombreProveedor.getText());
                pr.setTelefono(views.txtTelefono.getText());
                pr.setDireccion(views.txtDireccion.getText());
                pr.setCorreo(views.txtEmail.getText());
                pr.setObservaciones(views.txtObservaciones.getText());
                pr.setIdproveedor(Integer.parseInt(views.txtIdProveedor.getText()));
                if (prDao.modificar(pr)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor modificado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarProveedores) {
            if (views.txtIdProveedor.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int idproveedor = Integer.parseInt(views.txtIdProveedor.getText());

                if (prDao.accion("0", idproveedor)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor deshabilitado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al deshabilitar el proveedor", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuReingresarProveedores) {
            if (views.txtIdProveedor.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int idproveedor = Integer.parseInt(views.txtIdProveedor.getText());

                if (prDao.accion("1", idproveedor)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor reingresado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el proveedor", "Atención!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (e.getSource() == views.jMenuEliminarProveedoresDefinitivamente) {
            if (views.txtIdProveedor.getText().equals("")) { //si la fila no esta seleccionada
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Atención!", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminarlo?", "Atención!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {

                    pr.setIdproveedor(Integer.parseInt(views.txtIdProveedor.getText()));

                    if (prDao.eliminar(pr)) {
                        limpiarTable();
                        listarProveedores();
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el proveedor", "Atención!", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (resp == JOptionPane.NO_OPTION) {

                } else if (resp == JOptionPane.CLOSED_OPTION) {
                }
            }
        } else {
            limpiar();
        }

    }

    public void listarProveedores() {
        List<Proveedores> lista = prDao.ListaProveedores();//paso la clase Autores y lo almaceno en lista
        modelo = (DefaultTableModel) views.TableProveedor.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdproveedor();
            ob[1] = lista.get(i).getProveedor();
            ob[2] = lista.get(i).getTelefono();
            ob[3] = lista.get(i).getDireccion();
            ob[4] = lista.get(i).getCorreo();
            ob[5] = lista.get(i).getObservaciones();
            ob[6] = lista.get(i).getEstatus();

            modelo.addRow(ob);
        }
        views.TableProveedor.setModel(modelo);
    }

    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableProveedor) {
            int fila = views.TableProveedor.rowAtPoint(e.getPoint());//verifico la fila que toco
            views.txtIdProveedor.setText(views.TableProveedor.getValueAt(fila, 0).toString());//obtengo el id que se encuentra en el indice 0 y lo coloco en el txtIdproveedor
            views.txtNombreProveedor.setText(views.TableProveedor.getValueAt(fila, 1).toString());
            views.txtTelefono.setText(views.TableProveedor.getValueAt(fila, 2).toString());
            views.txtDireccion.setText(views.TableProveedor.getValueAt(fila, 3).toString());
            views.txtEmail.setText(views.TableProveedor.getValueAt(fila, 4).toString());
            views.txtObservaciones.setText(views.TableProveedor.getValueAt(fila, 5).toString());

            views.btnguardarproveedor.setEnabled(false);
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
        views.txtIdProveedor.setText("");
        views.txtNombreProveedor.setText("");
        views.txtTelefono.setText("");
        views.txtDireccion.setText("");
        views.txtEmail.setText("");
        views.txtObservaciones.setText("");
        views.btnguardarproveedor.setEnabled(true);
    }

}
