// Nombre del paquete
package Clases;

// Se importó para poder usar el "JOptionPane" en este caso
import javax.swing.JOptionPane;

// Se declara el nombre de la clase
public class clspromedio {
    // Se usa el atajo "psvm + TAB" para incluir la línea main
    public static void main(String[] args) {
        // Declarar las variables necesarias
        int nota1,nota2;
        double promedio;
        
        // Recopilar datos (Se importó una biblioteca para esto)
        nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota 1"));
        nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota 2"));
        
        // Proceso de cálculo
        promedio=(nota1+nota2)/2;
        
        // Mostrar al usuario el promedio solicitado (Usando la biblioteca importada)
        JOptionPane.showMessageDialog(null,"El promedio es: " + promedio);
        
        
    }
    
    public double promedio (int nota1,int nota2) {
        double promedio;
        promedio=(nota1+nota2)/2;
        return promedio;
    }
    
}
