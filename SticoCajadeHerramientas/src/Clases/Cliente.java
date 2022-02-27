
package Clases;

public class Cliente extends Persona {
    // Propiedades
    private String categoria;
    private String codigo;
    
    // Metodos
    public void generarCodigo() {
        this.setCodigo("C"+this.getNombres().substring(0,3));
    }
    
    // Get y Set
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
