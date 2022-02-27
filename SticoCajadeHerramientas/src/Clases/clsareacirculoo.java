
package Clases;

import javax.swing.JOptionPane;

public class clsareacirculoo {
    // Declarando las constantes
    
    static final double pi = 3.14159;
    
    public static void main(String[] args) {
        // Declarar variables
        
        double radio, area;
        
        // Recibiendo los datos
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        
        // Proceso
        
        // Código antiguo: area = pi * radio * radio;
        
        area = pi * Math.pow(radio, 2);
        
        // Salida
        
        JOptionPane.showMessageDialog(null, "El area del círculo es " + area);
        
        
    }
    
    public double clsareacirculo (double radio) {
        double area;
        area = pi * Math.pow(radio, 2);
        return area;
    }
}
