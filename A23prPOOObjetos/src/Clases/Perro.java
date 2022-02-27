
package Clases;

public class Perro {
    // Propiedades
    public String nombre;
    public String raza;
    public String altura;
    
    // Métodos
    public String comer (String carne) {
        return nombre + " mide " + altura + " y comerá " + carne;
    }
    
    public void dormir () {
        
    }
    
    public void ladrar () {
        
    }
    
    // Constructores
    public Perro () {
        
    }
    
    public Perro (String nombre,String raza,String altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
    }
    
    
    
}
