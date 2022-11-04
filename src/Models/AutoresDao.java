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
public class AutoresDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Autores au) {//booleano, si lo puedo registrar o no
        String sql = " INSERT INTO autor ( autor ) VALUES (?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setString(1, au.getAutor());//reemplazo los valoeres de ?

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public List ListaAutores() {
        List<Autores> listaAutor = new ArrayList<>();

        String sql = "SELECT * FROM autor";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {    //recorro hasat que el resultado sea verdadero             
                Autores au = new Autores();
                au.setIdautor(rs.getInt("idautor"));
                au.setAutor(rs.getString("autor"));
                au.setEstatus(rs.getString("estatus"));

                listaAutor.add(au);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaAutor;
    }

    public boolean modificar(Autores au) {//booleano, si lo puedo modificar o no
        String sql = " UPDATE autor SET autor = ? WHERE idautor  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setString(1, au.getAutor());//reemplazo los valoeres de ?
            ps.setInt(2, au.getIdautor());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estatus, int idautor) {
        String sql = "Update autor SET estatus = ? WHERE idautor = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estatus);
            ps.setInt(2, idautor);

            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean eliminar(Autores au) {//booleano, si lo puedo modificar o no
        String sql = " DELETE FROM autor WHERE  idautor  = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);//preparar sentencia
            ps.setInt(1, au.getIdautor());

            ps.execute();//ejecuto la sentencia
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
