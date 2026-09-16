package Ejercicios;

import java.util.Scanner;

public class ejercicio_8_2_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double l1, l2, l3;
        String resultado = "";

        System.out.println("Introduce el lado 1:");
        l1 = entrada.nextDouble();
        System.out.println("Introduce el lado 2:");
        l2 = entrada.nextDouble();
        System.out.println("Introduce el lado 3:");
        l3 = entrada.nextDouble();

        // Sin if anidados: evaluamos directamente con operadores lógicos &&
        if ((l1 == l2) && (l2 == l3)) {
            resultado = "Es un triángulo Equilátero";
        }
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) {
            resultado = "Es un triángulo Isósceles";
        }
        if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
            resultado = "Es un triángulo Escaleno";
        }

        System.out.println(resultado);
        System.exit(0);
    }
}