package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double tarifa, descuento = 0, subtotal, total;
        int tipo;
        String salida = "";

        System.out.println("Introduce la tarifa base del servicio:");
        tarifa = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce el tipo de usuario (1: Profesor, 2: Alumno, 3: General):");
        tipo = Integer.parseInt(entrada.readLine());

        if (tipo == 1) {
            descuento = tarifa * 0.20;
            salida = "Descuento aplicado: Profesor (20%)\n";
        } else {
            if (tipo == 2) {
                descuento = tarifa * 0.10;
                salida = "Descuento aplicado: Alumno (10%)\n";
            } else {
                descuento = 0.0;
                salida = "Sin descuento adicional (Público General)\n";
            }
        }

        subtotal = tarifa - descuento;
        total = subtotal + (subtotal * 0.16);

        System.out.println(salida);
        System.out.println("Tarifa base: $" + tarifa);
        System.out.println("Subtotal con descuento: $" + subtotal);
        System.out.println("Total final (con 16% IVA): $" + total);
        System.exit(0);
    }
}