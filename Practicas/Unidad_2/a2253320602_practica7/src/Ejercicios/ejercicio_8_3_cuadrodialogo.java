package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio_8_3_cuadrodialogo {
    public static void main(String[] args) {
        double l1, l2, l3;
        String resultado = "";

        l1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 1:"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 2:"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 3:"));

        if (l1 == l2) {
            if (l2 == l3) {
                resultado = "Es un triángulo Equilátero";
            } else {
                resultado = "Es un triángulo Isósceles";
            }
        } else {
            if (l1 == l3 || l2 == l3) {
                resultado = "Es un triángulo Isósceles";
            } else {
                resultado = "Es un triángulo Escaleno";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}