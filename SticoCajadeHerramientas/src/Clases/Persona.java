
package Clases;

public class Persona {

    private String apellidos;
    private String nombres;
    private String documento;
    private String tipo;
    
    // Constructores
    public Persona() {
        
    }

    public Persona(String apellidos, String nombres, String documento, String tipo) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.documento = documento;
        this.tipo = tipo;
    }
    
    // Get y Set
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
