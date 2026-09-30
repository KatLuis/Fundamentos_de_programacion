package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio08 {
    public static void main(String[] args) throws Exception {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        double precioConIva, porcentaje, precioSinIva, descuento, precioFinal;
        //para que pueda ser en decimal le puse Double.parseDouble en lugar de Integer.parseInt
        System.out.print("Ingresa el precio con IVA: ");
        precioConIva = Double.parseDouble(teclado.readLine());
        
        System.out.print("Ingresa el porcentaje de descuento: ");
        porcentaje = Double.parseDouble(teclado.readLine());
        
        // 1. Quitar el IVA
        precioSinIva = precioConIva / 1.16;
        
        // 2. Calcular la cantidad de descuento
        descuento = precioSinIva * (porcentaje / 100);
        
        // 3. Aplicar descuento al precio sin IVA
        precioFinal = precioSinIva - descuento;
        
        System.out.println("El precio sin IVA es: " + precioSinIva);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}