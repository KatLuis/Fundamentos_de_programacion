package problemas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumaImpares {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static int sumarImpares(int n) {
        int suma = 0;
        int contador = 0;
        int i = 1;

        while (contador < n) {
            suma += i;
            i += 2;
            contador++;
        }
        return suma;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese la cantidad de números impares a sumar (n):");
        int n = Integer.parseInt(lectura.readLine());

        int resultado = sumarImpares(n);
        System.out.println("La suma de los primeros " + n + " números impares es: " + resultado);
    }
}
