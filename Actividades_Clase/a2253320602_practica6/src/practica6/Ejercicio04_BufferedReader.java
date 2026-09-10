package practica6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio04_BufferedReader {
    
    public static String convertirATexto(int valor) {
        return String.valueOf(valor);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num, dm, um, c, d, u;
        String salida;
        
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = Integer.parseInt(reader.readLine());
        
        u = num % 10;
        num = num / 10; 
        
        d = num % 10;
        num = num / 10;
        
        c = num % 10;
        num = num / 10;
        
        um = num % 10;
        num = num / 10;
        
        dm = num;
        
        salida = convertirATexto(u) + " " + convertirATexto(d) + " " + convertirATexto(c);
        salida = salida + " " + convertirATexto(um) + " " + convertirATexto(dm);
        
        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        
        System.out.println(salida);
        System.out.println(num);
    }
}