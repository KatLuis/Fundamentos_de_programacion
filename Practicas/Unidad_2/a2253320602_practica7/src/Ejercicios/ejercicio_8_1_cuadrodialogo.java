package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String[] args) {
        double tarifa, descuento = 0, subtotal, total;
        int tipo;
        String salida = "";

        tarifa = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa base del servicio:"));
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de usuario:\n1. Profesor\n2. Alumno\n3. General"));

        if (tipo == 1) {
            descuento = tarifa * 0.20;
            salida = "Descuento aplicado: Profesor (20%)\n";
        } else if (tipo == 2) {
            descuento = tarifa * 0.10;
            salida = "Descuento aplicado: Alumno (10%)\n";
        } else {
            descuento = 0.0;
            salida = "Sin descuento adicional\n";
        }

        subtotal = tarifa - descuento;
        total = subtotal + (subtotal * 0.16);

        JOptionPane.showMessageDialog(null, salida + "Subtotal: $" + subtotal + "\nTotal final (con IVA): $" + total);
        System.exit(0);
    }
}