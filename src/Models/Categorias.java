
package Models;

/**
 *
 * @author Gerald
 */
public class Categorias {
    
    private int idcategoria;
    private String categoria;
    private String date_add;
    private String estatus;

    
        public Categorias() {
    }
        
    public Categorias(int idcategoria, String categoria, String date_add, String estatus) {
        this.idcategoria = idcategoria;
        this.categoria = categoria;
        this.date_add = date_add;
        this.estatus = estatus;
    }



    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
    
}
