package a2253320602_tarea14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatronesMatriz20x20 {

    private static final int FILAS = 20;
    private static final int COLUMNAS = 20;
    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[][] matriz = new String[FILAS][COLUMNAS];
        limpiarMatriz(matriz);
        menuPrincipal(matriz);
    }

    // Sistema de menú principal (estructura de menú y repetición)
    public static void menuPrincipal(String[][] matriz) throws IOException {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    cuadradoRelleno(matriz);
                    break;
                case 2:
                    cuadradoHueco(matriz);
                    break;
                case 3:
                    trianguloIzq(matriz);
                    break;
                case 4:
                    trianguloDer(matriz);
                    break;
                case 5:
                    piramide(matriz);
                    break;
                case 6:
                    piramideInvertida(matriz);
                    break;
                case 7:
                    rombo(matriz);
                    break;
                case 8:
                    diagonalPrincipal(matriz);
                    break;
                case 9:
                    diagonalSecundaria(matriz);
                    break;
                case 10:
                    equis(matriz);
                    break;
                case 11:
                    mostrarMatriz(matriz);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("MENU DE PATRONES");
        System.out.println("1. Cuadrado relleno");
        System.out.println("2. Cuadrado hueco");
        System.out.println("3. Triangulo rectangulo izquierdo");
        System.out.println("4. Triangulo rectangulo derecho");
        System.out.println("5. Piramide");
        System.out.println("6. Piramide invertida");
        System.out.println("7. Rombo");
        System.out.println("8. Diagonal principal");
        System.out.println("9. Diagonal secundaria");
        System.out.println("10. X (ambas diagonales)");
        System.out.println("11. Mostrar matriz actual");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // SUBPROCESO: Limpia la matriz dejando solo espacios vacíos
    public static void limpiarMatriz(String[][] m) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                m[i][j] = " ";
            }
        }
    }

    // ALGORITMO 1: Cuadrado relleno (10x10 centrado, filas/cols 4..13 en base 0 -> 5..14 en base 1)
    public static void cuadradoRelleno(String[][] m) {
        limpiarMatriz(m);
        for (int i = 4; i <= 13; i++) {
            for (int j = 4; j <= 13; j++) {
                m[i][j] = "*";
            }
        }
        System.out.println("Patron: Cuadrado relleno generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 2: Cuadrado hueco
    public static void cuadradoHueco(String[][] m) {
        limpiarMatriz(m);
        for (int i = 4; i <= 13; i++) {
            for (int j = 4; j <= 13; j++) {
                if (i == 4 || i == 13 || j == 4 || j == 13) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Cuadrado hueco generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 3: Triangulo rectangulo alineado a la izquierda
    public static void trianguloIzq(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                m[i][j] = "*";
            }
        }
        System.out.println("Patron: Triangulo izquierdo generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 4: Triangulo rectangulo alineado a la derecha
    public static void trianguloDer(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                m[i][10 - j] = "*";
            }
        }
        System.out.println("Patron: Triangulo derecho generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 5: Piramide (triangulo centrado)
    public static void piramide(String[][] m) {
        limpiarMatriz(m);
        int centro = 9; // equivale a centro = 10 en base 1
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                int despl = i - j;
                if (centro - despl >= 0 && centro - despl < COLUMNAS) {
                    m[i][centro - despl] = "*";
                }
                if (centro + despl >= 0 && centro + despl < COLUMNAS) {
                    m[i][centro + despl] = "*";
                }
            }
        }
        System.out.println("Patron: Piramide generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 6: Piramide invertida
    public static void piramideInvertida(String[][] m) {
        limpiarMatriz(m);
        int centro = 9;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < (10 - i); j++) {
                int despl = (9 - i) - j;
                if (centro - despl >= 0 && centro - despl < COLUMNAS) {
                    m[i][centro - despl] = "*";
                }
                if (centro + despl >= 0 && centro + despl < COLUMNAS) {
                    m[i][centro + despl] = "*";
                }
            }
        }
        System.out.println("Patron: Piramide invertida generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 7: Rombo
    public static void rombo(String[][] m) {
        limpiarMatriz(m);
        int centro = 9;

        // Parte superior (piramide)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                int despl = i - j;
                if (centro - despl >= 0 && centro - despl < COLUMNAS) {
                    m[i][centro - despl] = "*";
                }
                if (centro + despl >= 0 && centro + despl < COLUMNAS) {
                    m[i][centro + despl] = "*";
                }
            }
        }

        // Parte inferior (piramide invertida)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < (9 - i); j++) {
                int fila = i + 10;
                int despl = (8 - i) - j;
                if (fila < FILAS && centro - despl >= 0 && centro - despl < COLUMNAS) {
                    m[fila][centro - despl] = "*";
                }
                if (fila < FILAS && centro + despl >= 0 && centro + despl < COLUMNAS) {
                    m[fila][centro + despl] = "*";
                }
            }
        }
        System.out.println("Patron: Rombo generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 8: Diagonal principal
    public static void diagonalPrincipal(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            m[i][i] = "*";
        }
        System.out.println("Patron: Diagonal principal generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 9: Diagonal secundaria
    public static void diagonalSecundaria(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            m[i][(FILAS - 1) - i] = "*";
        }
        System.out.println("Patron: Diagonal secundaria generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 10: X (ambas diagonales cruzadas)
    public static void equis(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            m[i][i] = "*";
            m[i][(FILAS - 1) - i] = "*";
        }
        System.out.println("Patron: X (diagonales cruzadas) generada.");
        mostrarMatriz(m);
    }

    // SUBPROCESO: Mostrar la matriz 20x20
    public static void mostrarMatriz(String[][] m) {
        System.out.println();
        System.out.println("+--------------------+");
        for (int i = 0; i < FILAS; i++) {
            System.out.print("|");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("+--------------------+");
        System.out.println();
    }

    private static int leerEntero() throws IOException {
        try {
            String linea = lector.readLine();
            if (linea == null) {
                return -1;
            }
            return Integer.parseInt(linea.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}