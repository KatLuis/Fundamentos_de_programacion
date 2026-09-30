package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio09 {
    public static void main(String[] args) throws Exception {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa los kilómetros recorridos:");
        double kilometros = Double.parseDouble(lector.readLine());
        
        System.out.println("Ingresa los litros consumidos:");
        double litros = Double.parseDouble(lector.readLine());
        
        double rendimiento = kilometros / litros;
        
        System.out.println("El rendimiento del autobús es de: " + rendimiento + " km/l");
    }
}