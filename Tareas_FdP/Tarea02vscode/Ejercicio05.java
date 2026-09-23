import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double lado, aBase, alado, aTotal, volumen;

        System.out.println("Ingrese el valor del lado del Hexaedro o Cubo: ");
        lado = Double.parseDouble(reader.readLine());

        // Fórmulas del libro
        aBase = lado * lado;
        alado = 4 * (lado * lado);
        aTotal = 6 * (lado * lado);
        volumen = lado * lado * lado;

        System.out.println("El área de la base es: " + aBase);
        System.out.println("El área lateral de la base es: " + alado);
        System.out.println("El área total de la base es: " + aTotal);
        System.out.println("El volumen es: " + volumen);
    }
}