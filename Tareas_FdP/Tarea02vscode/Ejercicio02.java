import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double metros, largo, ancho, arena;
        
        metros = 0.5;
        
        System.out.println("Ingrese el largo de la pared en metros: ");
        largo = Double.parseDouble(entrada.readLine());
        
        System.out.println("Ingrese el ancho de la pared en metros: ");
        ancho = Double.parseDouble(entrada.readLine());
        
        arena = (largo * ancho) * metros;
        
        System.out.println("La cantidad de arena necesaria es de: " + arena);
    }
}
