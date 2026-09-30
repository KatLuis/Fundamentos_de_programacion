package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13 {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante
        
        System.out.println("Introduzca primer coeficiente (a):");
        a = Integer.parseInt(entrada.readLine());
        
        System.out.println("Introduzca segundo coeficiente (b):");
        b = Integer.parseInt(entrada.readLine());
        
        System.out.println("Introduzca tercer coeficiente (c):");
        c = Integer.parseInt(entrada.readLine());
        
        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        
        if (d > 0) // evaluamos si es mayor que 0
        {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }
}