import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double radio, area, volumen;

        System.out.println("Ingrese el radio de la esfera: ");
        radio = Double.parseDouble(reader.readLine());

        area = 4 * Math.PI * (radio * radio);
        volumen = (4 * Math.PI * (radio * radio * radio)) / 3.0;

        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}