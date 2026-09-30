package actividadparaasistenciaaclases;

import javax.swing.JOptionPane;

public class PracticaJOptionPane {
    public static void main(String[] args) {
        // Ventana emergente para capturar texto
        String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre:");
        
        // Ventana emergente para capturar un número (requiere conversión)
        String inputEdad = JOptionPane.showInputDialog(null, "Introduce tu edad:");
        int edad = Integer.parseInt(inputEdad);
        
        // Ventana emergente para mostrar el resultado final
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", tu edad es " + edad + " años.");
    }
}