package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerald
 */
public class ProveedoresDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Proveedores pr) {
        String sql = " INSERT INTO proveedor ( proveedor, telefono, direccion, correo, observaciones ) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getProveedor());
            ps.setString(2, pr.getTelefono());
            ps.setString(3, pr.getDireccion());
            ps.setString(4, pr.getCorreo());
            ps.setString(5, pr.getObservaciones());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaProveedores() {
        List<Proveedores> listaProveedor = new ArrayList<>();

        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {    //recorro hasat que el resultado sea verdadero             
                Proveedores pr = new Proveedores();
                pr.setIdproveedor(rs.getInt("idproveedor"));
                pr.setProveedor(rs.getString("proveedor"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                pr.setCorreo(rs.getString("correo"));
                pr.setObservaciones(rs.getString("observaciones"));
                pr.setEstatus(rs.getString("estatus"));

                listaProveedor.add(pr);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProveedor;
    }
    
    public boolean modificar(Proveedores pr) {//booleano, si lo puedo modificar o no
        String sql = " UPDATE proveedor SET proveedor = ?, telefono = ?, direccion = ?, correo = ?, observaciones = ? WHERE idproveedor  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setString(1, pr.getProveedor());//reemplazo los valoeres de ?
            ps.setString(2, pr.getTelefono());
            ps.setString(3, pr.getDireccion());
            ps.setString(4, pr.getCorreo());
            ps.setString(5, pr.getObservaciones());
            ps.setInt(6, pr.getIdproveedor());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estatus, int idproveedor) {
        String sql = "Update proveedor SET estatus = ? WHERE idproveedor = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estatus);
            ps.setInt(2, idproveedor);

            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
        public boolean eliminar(Proveedores pr) {//booleano, si lo puedo modificar o no
        String sql = " DELETE FROM proveedor WHERE  idproveedor  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setInt(1, pr.getIdproveedor());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}