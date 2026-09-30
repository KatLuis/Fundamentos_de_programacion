package ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio04 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa la cantidad de motores a ensamblar: ");
        int motores = Integer.parseInt(leer.readLine());
        
        System.out.print("Ingresa la cantidad de días disponibles: ");
        int dias = Integer.parseInt(leer.readLine());
        
        double obrerosCalculados = (48.0 * 10.0 * motores) / (30.0 * dias);
        int obrerosReales = (int) Math.ceil(obrerosCalculados);
        
        System.out.println("Para hacer " + motores + " motores en " + dias + " días, se requieren exactamente " + obrerosReales + " obreros.");
    }
}