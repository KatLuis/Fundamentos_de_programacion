package Ejercicios;

import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			double tarifa, descuento = 0, subtotal, total;
			int tipo;
			String salida = "";

			System.out.println("Introduce la tarifa base del servicio:");
			tarifa = entrada.nextDouble();
			
			System.out.println("Introduce el tipo de usuario (1: Profesor, 2: Alumno, 3: General):");
			tipo = entrada.nextInt();

			if (tipo == 1) {
			    descuento = tarifa * 0.20;
			    salida = "Descuento aplicado: Profesor (20%)\n";
			} else if (tipo == 2) {
			    descuento = tarifa * 0.10;
			    salida = "Descuento aplicado: Alumno (10%)\n";
			} else {
			    descuento = 0.0;
			    salida = "Sin descuento adicional (Público General)\n";
			}

			subtotal = tarifa - descuento;
			total = subtotal + (subtotal * 0.16);

			System.out.println(salida + "Subtotal: $" + subtotal + "\nTotal final con IVA: $" + total);
		}
        System.exit(0);
    }
}