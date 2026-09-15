package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio_8_2_cuadrodialogo {
    public static void main(String[] args) {
        double l1, l2, l3;
        String resultado = "";

        l1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 1:"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 2:"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 3:"));

        if ((l1 == l2) && (l2 == l3)) {
            resultado = "Es un triángulo Equilátero";
        }
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) {
            resultado = "Es un triángulo Isósceles";
        }
        if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
            resultado = "Es un triángulo Escaleno";
        }

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
