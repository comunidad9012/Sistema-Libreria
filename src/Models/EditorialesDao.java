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
public class EditorialesDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Editoriales ed) {
        String sql = " INSERT INTO editorial ( editorial ) VALUES (?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ed.getEditorial());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaEditoriales() {
        List<Editoriales> listaEditorial = new ArrayList<>();

        String sql = "SELECT * FROM editorial";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {    //recorro hasat que el resultado sea verdadero             
                Editoriales ed = new Editoriales();
                ed.setIdeditorial(rs.getInt("ideditorial"));
                ed.setEditorial(rs.getString("editorial"));
                ed.setEstatus(rs.getString("estatus"));

                listaEditorial.add(ed);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaEditorial;
    }
    
    public boolean modificar(Editoriales au) {//booleano, si lo puedo modificar o no
        String sql = " UPDATE editorial SET editorial = ? WHERE ideditorial  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setString(1, au.getEditorial());//reemplazo los valoeres de ?
            ps.setInt(2, au.getIdeditorial());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estatus, int ideditorial) {
        String sql = "Update editorial SET estatus = ? WHERE ideditorial = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estatus);
            ps.setInt(2, ideditorial);

            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
        public boolean eliminar(Editoriales au) {//booleano, si lo puedo modificar o no
        String sql = " DELETE FROM editorial WHERE  ideditorial  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setInt(1, au.getIdeditorial());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
