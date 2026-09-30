package actividadparaasistenciaaclases;

import java.util.Scanner;

public class PracticaScanner {
    public static void main(String[] args) {
        // Inicializamos el Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine(); // Lectura de cadena
        
        System.out.println("Introduce tu estatura en metros (ej. 1.75):");
        double estatura = scanner.nextDouble(); // Lectura de número decimal
        
        System.out.println("Datos capturados con Scanner:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura + " m");
        
        scanner.close(); // Cerramos el scanner
    }
}