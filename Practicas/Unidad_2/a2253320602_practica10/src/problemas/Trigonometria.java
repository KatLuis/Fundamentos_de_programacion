package problemas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Trigonometria {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static void mostrarTrigonometria(double angulo) {
        double senVal = Math.sin(angulo);
        double cosVal = Math.cos(angulo);
        double tanVal = Math.tan(angulo);

        System.out.println("--- Resultados Trigonométricos ---");
        System.out.println("Seno: " + senVal);
        System.out.println("Coseno: " + cosVal);
        System.out.println("Tangente: " + tanVal);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el valor del ángulo (en radianes):");
        double angulo = Double.parseDouble(lectura.readLine());

        mostrarTrigonometria(angulo);
    }
}