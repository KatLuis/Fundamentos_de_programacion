package Tarea05_RA;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea05_01 {
public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
double a, b, c; // coeficientes ax^2 + bx + c = 0
double x1, x2, d; // soluciones y determinante

System.out.println("Introduzca primer coeficiente (a):");
a = Double.parseDouble(entrada.readLine());
System.out.println("Introduzca segundo coeficiente (b):");
b = Double.parseDouble(entrada.readLine());
System.out.println("Introduzca tercer coeficiente (c):");
c = Double.parseDouble(entrada.readLine());

// calculamos el determinante
d = ((b * b) - 4 * a * c);

if (d < 0) {
System.out.println("No existen soluciones reales");
} else {
// queda confirmar que a sea distinto de 0.
// si a = 0 nos encontramos una división por cero.
if (a == 0) {
System.out.println("Error: el coeficiente a debe ser diferente de cero");
} else {
x1 = (-b + Math.sqrt(d)) / (2 * a);
x2 = (-b - Math.sqrt(d)) / (2 * a);
System.out.println("Solución: " + x1);
System.out.println("Solución: " + x2);
}
}
}
}