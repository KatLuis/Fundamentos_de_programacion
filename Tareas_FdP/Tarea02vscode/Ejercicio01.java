import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double interes = 0.02;
        
        System.out.println("Ingrese el monto a invertir: ");
        double capital = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese el número total de días del mes a considerar: ");
        int dias = Integer.parseInt(reader.readLine());

        double ganancia = capital * dias * interes;

        System.out.println("La ganancia por cobrar después del mes es de: " + ganancia);
    }
}