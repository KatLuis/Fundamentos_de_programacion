package ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio07 {
    public static void main(String[] args) throws Exception {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa la cantidad de segundos:");
        double segundos = Double.parseDouble(lector.readLine());
        
        double minutos = segundos / 60;
        double horas = segundos / 3600;
        
        System.out.println("Resultados de la conversión:");
        System.out.println(segundos + " segundos son " + minutos + " minutos.");
        System.out.println(segundos + " segundos son " + horas + " horas.");
    }
}