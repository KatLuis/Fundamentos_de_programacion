package actividadparaasistenciaaclases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PracticaBufer {
    public static void main(String[] args) throws IOException {
        // Inicializamos el BufferedReader para leer de la consola
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce tu nombre completo:");
        String nombre = bufer.readLine(); // Lectura de cadena
        
        System.out.println("Introduce tu edad:");
        int edad = Integer.parseInt(bufer.readLine()); // Conversión de texto a entero
        
        System.out.println("Registro exitoso:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}