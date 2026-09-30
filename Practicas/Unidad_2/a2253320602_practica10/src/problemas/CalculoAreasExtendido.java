package problemas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoAreasExtendido {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        System.out.println(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static double calcularareacirculo(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double calcularareatriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calculararearectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularareatrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public static void mostrarmenu() {
        System.out.println("Menú:");
        System.out.println("c. Calcular área del círculo");
        System.out.println("t. Calcular área del triángulo");
        System.out.println("r. Calcular área del rectángulo");
        System.out.println("p. Calcular área del trapecio");
        System.out.println("s. Salir");
        System.out.println("Elige una opción: ");
    }

    public static void main(String[] args) throws IOException {
        String opcion = "";

        while (!opcion.equals("S")) {
            mostrarmenu();
            opcion = lectura.readLine().toUpperCase();

            switch (opcion) {
                case "C":
                    double radio = pedirdato("Ingresa el radio del círculo: ");
                    System.out.println("El área del círculo es: " + calcularareacirculo(radio));
                    break;
                case "T":
                    double baseT = pedirdato("Ingresa la base del triángulo: ");
                    double alturaT = pedirdato("Ingresa la altura del triángulo: ");
                    System.out.println("El área del triángulo es: " + calcularareatriangulo(baseT, alturaT));
                    break;
                case "R":
                    double baseR = pedirdato("Ingresa la base del rectángulo: ");
                    double alturaR = pedirdato("Ingresa la altura del rectángulo: ");
                    System.out.println("El área del rectángulo es: " + calculararearectangulo(baseR, alturaR));
                    break;
                case "P":
                    double baseMay = pedirdato("Ingresa la base mayor del trapecio: ");
                    double baseMen = pedirdato("Ingresa la base menor del trapecio: ");
                    double alturaP = pedirdato("Ingresa la altura del trapecio: ");
                    System.out.println("El área del trapecio es: " + calcularareatrapecio(baseMay, baseMen, alturaP));
                    break;
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();
        }
    }
}

