package a2253320602_tarea14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatronesMatriz20x20_Parte2 {

    private static final int FILAS = 20;
    private static final int COLUMNAS = 20;
    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[][] matriz = new String[FILAS][COLUMNAS];
        limpiarMatriz(matriz);
        menuPrincipal(matriz);
    }

    // Sistema de menú principal (Parte 2)
    public static void menuPrincipal(String[][] matriz) throws IOException {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    cruzRellena(matriz);
                    break;
                case 2:
                    cruzHueca(matriz);
                    break;
                case 3:
                    tableroAjedrez(matriz);
                    break;
                case 4:
                    lineasHorizontales(matriz);
                    break;
                case 5:
                    lineasVerticales(matriz);
                    break;
                case 6:
                    marcoDoble(matriz);
                    break;
                case 7:
                    flechaDerecha(matriz);
                    break;
                case 8:
                    circulo(matriz);
                    break;
                case 9:
                    espiralCuadrada(matriz);
                    break;
                case 10:
                    corazon(matriz);
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
        System.out.println("MENU DE PATRONES (PARTE 2)");
        System.out.println("1. Cruz (+) rellena");
        System.out.println("2. Cruz hueca (contorno)");
        System.out.println("3. Tablero de ajedrez");
        System.out.println("4. Lineas horizontales alternas");
        System.out.println("5. Lineas verticales alternas");
        System.out.println("6. Marco doble (borde + borde interno)");
        System.out.println("7. Flecha hacia la derecha");
        System.out.println("8. Circulo aproximado");
        System.out.println("9. Espiral cuadrada");
        System.out.println("10. Corazon");
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

    // ALGORITMO 1: Cruz rellena (grosor 3; filas/cols 8..10 en base 0 -> 9..11 en base 1)
    public static void cruzRellena(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if ((i >= 8 && i <= 10) || (j >= 8 && j <= 10)) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Cruz rellena generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 2: Cruz hueca (solo el contorno de la cruz)
    public static void cruzHueca(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                // Contorno horizontal
                if ((i == 8 || i == 10) && (j >= 2 && j <= 17)) {
                    m[i][j] = "*";
                }
                // Contorno vertical
                if ((j == 8 || j == 10) && (i >= 2 && i <= 17)) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Cruz hueca generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 3: Tablero de ajedrez
    public static void tableroAjedrez(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if ((i + j) % 2 == 0) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Tablero de ajedrez generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 4: Lineas horizontales alternas
    public static void lineasHorizontales(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            if (i % 3 == 0) { // equivale a (i+1) MOD 3 == 1 en base 1
                for (int j = 0; j < COLUMNAS; j++) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Lineas horizontales generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 5: Lineas verticales alternas
    public static void lineasVerticales(String[][] m) {
        limpiarMatriz(m);
        for (int j = 0; j < COLUMNAS; j++) {
            if (j % 3 == 0) { // equivale a (j+1) MOD 3 == 1 en base 1
                for (int i = 0; i < FILAS; i++) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Lineas verticales generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 6: Marco doble (borde externo + borde interno)
    public static void marcoDoble(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                // Borde externo (0 y 19 en base 0 -> 1 y 20 en base 1)
                if (i == 0 || i == FILAS - 1 || j == 0 || j == COLUMNAS - 1) {
                    m[i][j] = "*";
                }
                // Borde interno (3 y 16 en base 0 -> 4 y 17 en base 1)
                if ((i == 3 || i == 16) && (j >= 3 && j <= 16)
                        || (j == 3 || j == 16) && (i >= 3 && i <= 16)) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Marco doble generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 7: Flecha hacia la derecha
    public static void flechaDerecha(String[][] m) {
        limpiarMatriz(m);
        int centro = 9; // equivale a centro = 10 en base 1

        // Punta de la flecha (triangulo)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                int despl = i - j;
                int col = (COLUMNAS - 1) - i; // equivale a 20 - i en base 1
                if (col >= 0 && col < COLUMNAS) {
                    if (centro - despl >= 0 && centro - despl < FILAS) {
                        m[centro - despl][col] = "*";
                    }
                    if (centro + despl >= 0 && centro + despl < FILAS) {
                        m[centro + despl][col] = "*";
                    }
                }
            }
        }

        // Cuerpo de la flecha (linea horizontal de grosor 3)
        for (int j = 0; j < 15; j++) {
            if (centro >= 0 && centro < FILAS) {
                m[centro][j] = "*";
            }
            if (centro - 1 >= 0 && centro - 1 < FILAS) {
                m[centro - 1][j] = "*";
            }
            if (centro + 1 >= 0 && centro + 1 < FILAS) {
                m[centro + 1][j] = "*";
            }
        }

        System.out.println("Patron: Flecha derecha generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 8: Circulo aproximado
    public static void circulo(String[][] m) {
        limpiarMatriz(m);
        double cx = 9.5; // equivale a 10.5 en base 1
        double cy = 9.5;
        double r = 8.0;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                double d = Math.sqrt(Math.pow(i - cx, 2) + Math.pow(j - cy, 2));
                if (d > r - 0.6 && d <= r + 0.6) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Circulo generado.");
        mostrarMatriz(m);
    }

    // ALGORITMO 9: Espiral cuadrada
    public static void espiralCuadrada(String[][] m) {
        limpiarMatriz(m);
        int top = 0;
        int bottom = FILAS - 1;
        int left = 0;
        int right = COLUMNAS - 1;

        while (top <= bottom && left <= right) {
            // Arriba
            for (int j = left; j <= right; j++) {
                m[top][j] = "*";
            }
            // Derecha
            for (int i = top + 1; i <= bottom; i++) {
                m[i][right] = "*";
            }
            // Abajo
            if (top < bottom) {
                for (int j = right - 1; j >= left; j--) {
                    m[bottom][j] = "*";
                }
            }
            // Izquierda
            if (left < right) {
                for (int i = bottom - 1; i >= top + 1; i--) {
                    m[i][left] = "*";
                }
            }

            top += 2;
            bottom -= 2;
            left += 2;
            right -= 2;
        }

        System.out.println("Patron: Espiral cuadrada generada.");
        mostrarMatriz(m);
    }

    // ALGORITMO 10: Corazon
    public static void corazon(String[][] m) {
        limpiarMatriz(m);
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                double x = ((j + 1) - 10.5) / 6.0;
                double y = ((i + 1) - 8.0) / 6.0;
                double expr = Math.pow(x * x + y * y - 1.0, 3) - (x * x) * Math.pow(y, 3);
                if (expr <= 0.0) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Corazon generado.");
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