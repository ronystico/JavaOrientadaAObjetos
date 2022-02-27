
package PaqueteEjemplos;

import javax.swing.JOptionPane;

public class clspotenciaa {
    public static void main(String[] args) {
        // Declarando variables
        
        short a,n;
        int p;
        
        // Entrada de datos
        
        a = Short.parseShort(JOptionPane.showInputDialog("Ingrese la base de la potencia"));
        n = Short.parseShort(JOptionPane.showInputDialog("Ingresar exponente de la potencia"));
        
        // Procesos
        
        p = (int)Math.pow (a, n);
        
        // La salida
        
        JOptionPane.showMessageDialog(null, "La potencia de " + a + " elevado a " + n + " es " + p);
        
        
        
        
    }
}
