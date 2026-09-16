package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio05 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;
        
        System.out.println("Menu de Opciones");
        System.out.println("1.- Productos");
        System.out.println("2.- Punto de venta");
        System.out.print("Que opcion deseas: ");
        int opc = Integer.parseInt(entrada.readLine());
        
        switch (opc) {
            case 1:
                System.out.println("elegiste la opcion de productos");
                System.out.println("el " + producto1 + " cuesta " + precio1);
                System.out.println("el " + producto2 + " cuesta " + precio2);
                break;
            case 2:
                System.out.print("Introduzca la cantidad comprada de " + producto1 + ": ");
                int cant1 = Integer.parseInt(entrada.readLine());
                
                System.out.print("Introduzca la cantidad comprada de " + producto2 + ": ");
                int cant2 = Integer.parseInt(entrada.readLine());
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = iva1 + subtotal1;
                
                System.out.println("\n--- Detalle Producto 1 ---");
                System.out.println(cant1 + " " + producto1);
                System.out.println("subtotal fue " + subtotal1 + ", iva fue " + iva1 + ", total fue " + total1);
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = iva2 + subtotal2;
                
                System.out.println("\n--- Detalle Producto 2 ---");
                System.out.println(cant2 + " " + producto2);
                System.out.println("subtotal fue " + subtotal2 + ", iva fue " + iva2 + ", total fue " + total2);
                
                System.out.println("\n--- Resumen Final ---");
                System.out.println("el total de la venta fue");
                System.out.println("subtotal fue " + (subtotal1 + subtotal2));
                System.out.println("el total de iva fue " + (iva1 + iva2));
                System.out.println("Total fue " + (total1 + total2));
                break;
            default:
                System.out.println("eleccion incorrecta");
                break;
        }
    }
}