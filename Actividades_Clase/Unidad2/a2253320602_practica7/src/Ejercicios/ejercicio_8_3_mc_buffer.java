package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_3_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double l1, l2, l3;
        String resultado = "";

        System.out.println("Introduce el lado 1:");
        l1 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el lado 2:");
        l2 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el lado 3:");
        l3 = Double.parseDouble(entrada.readLine());

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

        System.out.println(resultado);
        System.exit(0);
    }
}