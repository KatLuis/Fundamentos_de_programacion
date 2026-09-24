package ejercicioc09sep;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ejercicioif1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n;
        int npar = 0;   
        int nimpar = 0; 
        
        // --- Número 1 ---
        System.out.println("introduce el numero 1 entero positivo");
        n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            if (n % 2 == 0) {
                npar = npar + 1;
            } else {
                nimpar = nimpar + 1;
            }
        }
        //

        System.out.println("introduce el numero 2 entero positivo");
        n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            if (n % 2 == 0) {
                npar = npar + 1;
            } else {
                nimpar = nimpar + 1;
            }
        }
        
        // 
        System.out.println("introduce el numero 3 entero positivo");
        n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            if (n % 2 == 0) {
                npar = npar + 1;
            } else {
                nimpar = nimpar + 1;
            }
        }
        
        // 
        System.out.println("introduce el numero 4 entero positivo");
        n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            if (n % 2 == 0) {
                npar = npar + 1;
            } else {
                nimpar = nimpar + 1;
            }
        }
        
        // 
        System.out.println("introduce el numero 5 entero positivo");
        n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            if (n % 2 == 0) {
                npar = npar + 1;
            } else {
                nimpar = nimpar + 1;
            }
        }
        
        // Resultados finales
        System.out.println("fueron " + npar + " numeros par");
        System.out.println("fueron " + nimpar + " numeros impar");
    }
}