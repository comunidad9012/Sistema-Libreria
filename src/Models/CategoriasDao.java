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
public class CategoriasDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Categorias ca) {
        String sql = " INSERT INTO categoria ( categoria ) VALUES (?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getCategoria());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }

    }
    
        public List ListaCategorias() {
        List<Categorias> listaCategoria = new ArrayList<>();

        String sql = "SELECT * FROM categoria";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {    //recorro hasat que el resultado sea verdadero             
                Categorias ca = new Categorias();
                ca.setIdcategoria(rs.getInt("idcategoria"));
                ca.setCategoria(rs.getString("categoria"));
                ca.setEstatus(rs.getString("estatus"));

                listaCategoria.add(ca);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaCategoria;
    }
    
    public boolean modificar(Categorias ca) {//booleano, si lo puedo modificar o no
        String sql = " UPDATE categoria SET categoria = ? WHERE idcategoria  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setString(1, ca.getCategoria());//reemplazo los valoeres de ?
            ps.setInt(2, ca.getIdcategoria());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estatus, int idcategoria) {
        String sql = "Update categoria SET estatus = ? WHERE idcategoria = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estatus);
            ps.setInt(2, idcategoria);

            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
        public boolean eliminar(Categorias au) {//booleano, si lo puedo modificar o no
        String sql = " DELETE FROM categoria WHERE  idcategoria  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setInt(1, au.getIdcategoria());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

}
