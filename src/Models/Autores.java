package Models;

/**
 *
 * @author Gerald
 */
public class Autores {

    private int idautor;
    private String autor;
    private String usuario_id;
    private String estatus;

    public Autores() {

    }

    public Autores(int idautor, String autor, String usuario_id, String estatus) {
        this.idautor = idautor;
        this.autor = autor;
        this.usuario_id = usuario_id;
        this.estatus = estatus;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
