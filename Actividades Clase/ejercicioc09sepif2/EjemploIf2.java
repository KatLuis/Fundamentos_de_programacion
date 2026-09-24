package ejercicioc09sepif2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjemploIf2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Definir a, b, c Como Entero
        int a, b, c;
        // Definir x1, x2, d Como Real
        double x1, x2, d;
        
        System.out.println("introduce el coeficiente numero 1 ");
        a = Integer.parseInt(reader.readLine());
        
        System.out.println("introduce el coeficiente numero 2 ");
        b = Integer.parseInt(reader.readLine());
        
        System.out.println("introduce el coeficiente numero 3 ");
        c = Integer.parseInt(reader.readLine());
        
        // d= ((b*b) - 4*a*c)
        d = ((b * b) - 4 * a * c);
        
        if (d > 0) {
            // x1 = (-b+ RAIZ(d)) /(2*a)
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            
            // x2 = (-b- RAIZ(d)) /(2*a)
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            
            System.out.println("la solucion de x1 " + x1 + " y la de X2 " + x2);
        } else {
            System.out.println(" no existe soluciones reales");
        }
    }
}