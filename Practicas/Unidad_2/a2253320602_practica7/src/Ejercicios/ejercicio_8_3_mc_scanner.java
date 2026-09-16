package Ejercicios;

import java.util.Scanner;

public class ejercicio_8_3_mc_scanner {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			double l1, l2, l3;
			String resultado = "";

			System.out.println("Introduce el lado 1:");
			l1 = entrada.nextDouble();
			System.out.println("Introduce el lado 2:");
			l2 = entrada.nextDouble();
			System.out.println("Introduce el lado 3:");
			l3 = entrada.nextDouble();

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
		}
        System.exit(0);
    }
}