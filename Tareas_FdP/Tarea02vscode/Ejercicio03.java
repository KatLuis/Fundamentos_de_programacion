import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double radio, generatriz, altura, aBase, alado, aTotal, volumen;

        System.out.println("Ingrese el radio del cono: ");
        radio = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la generatriz del cono: ");
        generatriz = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura del cono: ");
        altura = Double.parseDouble(reader.readLine());

        aBase = Math.PI * (radio * radio);
        alado = Math.PI * radio * generatriz;
        aTotal = aBase + alado;
        volumen = (1.0 / 3.0) * aBase * altura;

        System.out.println("El área de la base es: " + aBase);
        System.out.println("El área lateral es: " + alado);
        System.out.println("El área total es: " + aTotal);
        System.out.println("El volumen es: " + volumen);
    }
}