
package Models;

/**
 *
 * @author Gerald
 */
public class Editoriales {
    private int ideditorial;
    private String editorial;
    private String usuario_id ;
    private String estatus;
    
    public Editoriales(){
        
    }

    public Editoriales(int ideditorial, String editorial, String usuario_id, String estatus) {
        this.ideditorial = ideditorial;
        this.editorial = editorial;
        this.usuario_id = usuario_id;
        this.estatus = estatus;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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