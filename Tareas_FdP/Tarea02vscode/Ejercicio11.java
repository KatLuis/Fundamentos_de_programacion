import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double largo, ancho, altura, area, volumen;

        System.out.println("Ingrese el largo: ");
        largo = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese el ancho: ");
        ancho = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura: ");
        altura = Double.parseDouble(reader.readLine());

        area = 2 * ((largo * ancho) + (largo * altura) + (ancho * altura));
        volumen = largo * ancho * altura;

        System.out.println("El área total es: " + area);
        System.out.println("El volumen es: " + volumen);
    }
}