import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce la longitud de la losa (X):");
        double X = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce el ancho de la losa (Y):");
        double Y = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce el espesor de la losa (N):");
        double N = Double.parseDouble(entrada.readLine());
        
        double volumen = X * Y * N;
        double cemento = volumen * 7;
        double arena = volumen * 0.52;
        double grava = volumen * 0.82;
        double agua = volumen * 200;
        
        System.out.println("Volumen total de la losa: " + volumen + " m3");
        System.out.println("Cemento necesario (bultos): " + cemento);
        System.out.println("Arena necesaria (m3): " + arena);
        System.out.println("Grava necesaria (m3): " + grava);
        System.out.println("Agua necesaria (litros): " + agua);
    }
}