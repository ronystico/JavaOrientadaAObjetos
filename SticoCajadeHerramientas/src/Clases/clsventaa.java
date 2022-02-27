
package Clases;

import javax.swing.JOptionPane;

public class clsventaa {
    // Declarando constante
    static final double igv = 0.18;
    
    public static void main(String[] args) {
        // Declarar variables
        int cant;
        double pcompra, pparcial, m_igv, pneto;
        
        // Entrada de los datos
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
        pcompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de compra"));
        
        // Proceso
        
        pparcial = cant * pcompra;
        m_igv = pparcial * igv;
        pneto = pparcial + m_igv;
        
        // Salida
        
        JOptionPane.showMessageDialog(null, "El precio parcial es: " + pparcial + "\n El monto IGV: " + m_igv + "\n El precio neto es: " + pneto);
        
        
    }
    
    public String venta (int cant, double pcompra) {
        double pparcial, m_igv, pneto;
        
        pparcial = cant * pcompra;
        m_igv = pparcial * igv;
        pneto = pparcial + m_igv;
        
        return ("El precio parcial es: " + pparcial + "\n El monto IGV: " + m_igv + "\n El precio neto es: " + pneto);
    }
    
    
}
