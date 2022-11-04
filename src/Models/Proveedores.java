package Models;

/**
 *
 * @author lenovo
 */
public class Proveedores {

    private int codproveedor;
    private String proveedor;
    private String contacto;
    private String telefono;
    private String direccion;
    private String correo;
    private String observaciones;
    private String date_add;
    private String usuario_id;
    private String estatus;

    public Proveedores() {
    }

    public Proveedores(int codproveedor, String proveedor, String contacto, String telefono, String direccion, String correo, String observaciones, String date_add, String usuario_id, String estatus) {
        this.codproveedor = codproveedor;
        this.proveedor = proveedor;
        this.contacto = contacto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.observaciones = observaciones;
        this.date_add = date_add;
        this.usuario_id = usuario_id;
        this.estatus = estatus;
    }

    public int getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(int codproveedor) {
        this.codproveedor = codproveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}
