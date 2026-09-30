package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ejerciciofirewall2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce el puerto de acceso:");
        int puerto = Integer.parseInt(br.readLine());
        
        System.out.println("Introduce el protocolo que usas TCP[1] o UDP[2]:");
        int protocolo = Integer.parseInt(br.readLine());
        
        if ((protocolo == 1) && (puerto == 80 || puerto == 443 || puerto == 22)) {
            System.out.println("Válido el protocolo TCP puerto " + puerto);
        } else if ((protocolo == 2) && (puerto == 53 || puerto == 22)) {
            System.out.println("Válido el protocolo udp puerto " + puerto);
        }
    }
}