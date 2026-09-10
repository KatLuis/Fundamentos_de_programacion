package practica6;

import java.util.Scanner;

public class Ejercicio05_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumacant = 0;
        String salida;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;
        int cant;
        
        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = scanner.nextDouble();
        
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = scanner.nextInt();
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = scanner.nextDouble();
        
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = scanner.nextInt();
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        System.out.print("Introduzca el precio pieza de pan frances: ");
        precio = scanner.nextDouble();
        
        System.out.print("Introduzca la cantidad comprada piezas de pan frances: ");
        cant = scanner.nextInt();
        
        subtotal = precio * cant;
        iva = 0.16 * precio;
        total = iva + subtotal;
        
        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);
        
        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;
        
        System.out.println("el total de productos vendidos fue " + sumacant);
        System.out.println("el total del iva fue " + sumaiva);
        System.out.println("el total -----------> " + sumatotal);
        
        scanner.close();
    }
}