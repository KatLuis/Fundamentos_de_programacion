import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double radio, area, volumen;

        System.out.println("Introduzca el valor del radio: ");
        radio = Double.parseDouble(reader.readLine());

        // Fórmulas del libro
        area = (4 * Math.PI) * (radio * radio);
        volumen = ((4 * Math.PI) * (radio * radio * radio)) / 3.0;

        System.out.println("El resultado del área de la esfera es: " + area);
        System.out.println("El resultado del Volumen de la esfera es: " + volumen);
    }
}