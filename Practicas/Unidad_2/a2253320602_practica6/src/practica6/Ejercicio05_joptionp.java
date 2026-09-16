package practica6;

import javax.swing.JOptionPane;

public class Ejercicio05_joptionp {
    public static void main(String[] args) {
        double sumacant = 0;
        String salida;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;
        int cant;
        
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el precio del Refresco coca cola light lata"));
        cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad comprada del Refresco coca cola light lata"));
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva) + "\nTotal " + String.valueOf(total);
        JOptionPane.showMessageDialog(null, salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el precio 1/4 de Arroz"));
        cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad comprada del 1/4 de Arroz"));
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva) + "\nTotal " + String.valueOf(total);
        JOptionPane.showMessageDialog(null, salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el precio pieza de pan frances"));
        cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad comprada piezas de pan frances"));
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva) + "\nTotal " + String.valueOf(total);
        JOptionPane.showMessageDialog(null, salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        String resultadoFinal = "el total de productos vendidos fue " + sumacant + "\n" +
                                 "el total del iva fue " + sumaiva + "\n" +
                                 "el total -----------> " + sumatotal;
        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}