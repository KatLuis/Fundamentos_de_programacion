import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double radio, altura, generatriz, areaLateral, areaTotal, volumen;

        System.out.println("Ingrese el radio del cono: ");
        radio = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura del cono: ");
        altura = Double.parseDouble(reader.readLine());

        generatriz = Math.sqrt((radio * radio) + (altura * altura));
        areaLateral = Math.PI * radio * generatriz;
        areaTotal = Math.PI * radio * (radio + generatriz);
        volumen = (Math.PI * (radio * radio) * altura) / 3.0;

        System.out.println("La generatriz es: " + generatriz);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
    }
}