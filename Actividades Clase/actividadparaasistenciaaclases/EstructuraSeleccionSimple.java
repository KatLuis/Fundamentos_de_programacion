package actividadparaasistenciaaclases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EstructuraSeleccionSimple {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa tu edad:");
        int edad = Integer.parseInt(bufer.readLine());
        
        // Estructura de selección simple (if)
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        
        System.out.println("Fin del programa.");
    }
}