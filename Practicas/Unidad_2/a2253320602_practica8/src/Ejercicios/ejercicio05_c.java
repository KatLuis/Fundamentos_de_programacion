package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio05_c {
    public static void main(String[] args) {
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;
        
        String menu = "Menu de Opciones\n" +
                      "1.- Productos\n" +
                      "2.- Punto de venta\n" +
                      "Que opcion deseas:";
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opc) {
            case 1:
                String msgProductos = "elegiste la opcion de productos\n" +
                                      "el " + producto1 + " cuesta " + precio1 + "\n" +
                                      "el " + producto2 + " cuesta " + precio2;
                JOptionPane.showMessageDialog(null, msgProductos);
                break;
            case 2:
                int cant1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de " + producto1 + ":"));
                int cant2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de " + producto2 + ":"));
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = iva1 + subtotal1;
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = iva2 + subtotal2;
                
                double subtotalGeneral = subtotal1 + subtotal2;
                double ivaGeneral = iva1 + iva2;
                double totalGeneral = total1 + total2;
                
                String ticket = "--- TICKET DE VENTA ---\n" +
                                cant1 + " " + producto1 + "\n" +
                                "subtotal fue " + subtotal1 + ", iva fue " + iva1 + ", total fue " + total1 + "\n\n" +
                                cant2 + " " + producto2 + "\n" +
                                "subtotal fue " + subtotal2 + ", iva fue " + iva2 + ", total fue " + total2 + "\n\n" +
                                "el total de la venta fue:\n" +
                                "subtotal fue " + subtotalGeneral + "\n" +
                                "el total de iva fue " + ivaGeneral + "\n" +
                                "Total fue " + totalGeneral;
                
                JOptionPane.showMessageDialog(null, ticket);
                break;
            default:
                JOptionPane.showMessageDialog(null, "eleccion incorrecta");
                break;
        }
    }
}