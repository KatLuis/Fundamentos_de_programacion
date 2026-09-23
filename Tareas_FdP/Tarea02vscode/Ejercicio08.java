import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double radio, altura, area, volumen;

        System.out.println("Ingrese el radio del cilindro: ");
        radio = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese la altura del cilindro: ");
        altura = Double.parseDouble(reader.readLine());

        area = 2 * Math.PI * radio * (radio + altura);
        volumen = Math.PI * (radio * radio) * altura;

        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}