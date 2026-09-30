package ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa la cantidad de días:");
        
        int dias = Integer.parseInt(reader.readLine());
        
        int semanas = dias / 7;
        int sobrantes = dias % 7;
        
        System.out.println("Son: " + semanas + " semana(s) y " + sobrantes + " día(s) sobrantes.");
    }
}