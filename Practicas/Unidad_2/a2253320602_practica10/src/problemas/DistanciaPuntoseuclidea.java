package problemas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DistanciaPuntoseuclidea {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese x1:");
        double x1 = Double.parseDouble(lectura.readLine());
        System.out.println("Ingrese y1:");
        double y1 = Double.parseDouble(lectura.readLine());
        System.out.println("Ingrese x2:");
        double x2 = Double.parseDouble(lectura.readLine());
        System.out.println("Ingrese y2:");
        double y2 = Double.parseDouble(lectura.readLine());

        double resultado = calcularDistancia(x1, y1, x2, y2);
        System.out.println("La distancia euclídea es: " + resultado);
    }
}
