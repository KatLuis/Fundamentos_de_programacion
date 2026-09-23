import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1, x2, x3, y1, y2, y3, area;

        System.out.println("Ingresa la cordenada de x1: ");
        x1 = Double.parseDouble(reader.readLine());
        System.out.println("Ingresa la cordenada de y1: ");
        y1 = Double.parseDouble(reader.readLine());
        System.out.println("Ingresa la cordenada de x2: ");
        x2 = Double.parseDouble(reader.readLine());
        System.out.println("Ingresa la cordenada de y2: ");
        y2 = Double.parseDouble(reader.readLine());
        System.out.println("Ingresa la cordenada de x3: ");
        x3 = Double.parseDouble(reader.readLine());
        System.out.println("Ingresa la cordenada de y3: ");
        y3 = Double.parseDouble(reader.readLine());

        area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1))) / 2.0;

        System.out.println("El Área del Triangulo con respecto a sus Vertices es: " + area);
    }
}