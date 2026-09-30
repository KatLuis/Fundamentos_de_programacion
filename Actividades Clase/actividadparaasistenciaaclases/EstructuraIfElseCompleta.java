package actividadparaasistenciaaclases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EstructuraIfElseCompleta {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa un número entero:");
        int numero = Integer.parseInt(bufer.readLine());
        
        // Estructura condicional doble
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es Par.");
        } else {
            System.out.println("El número " + numero + " es Impar.");
        }
    }
}