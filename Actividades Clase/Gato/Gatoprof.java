package actividadesT2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gatoprof {
    private static int l11;
    private static int l12;
    private static int l13;
    private static int l21;
    private static int l22;
    private static int l23;
    private static int l31;
    private static int l32;
    private static int l33;

    private static void inicializar() {
        l11 = 0;
        l12 = 0;
        l13 = 0;
        l21 = 0;
        l22 = 0;
        l23 = 0;
        l31 = 0;
        l32 = 0;
        l33 = 0;
    }

    private static int verificarGanador(int jugador) {
        // Líneas horizontales
        if ((l11 == jugador && l12 == jugador && l13 == jugador) ||
            (l21 == jugador && l22 == jugador && l23 == jugador) ||
            (l31 == jugador && l32 == jugador && l33 == jugador) ||
            // Líneas verticales
            (l11 == jugador && l21 == jugador && l31 == jugador) ||
            (l12 == jugador && l22 == jugador && l32 == jugador) ||
            (l13 == jugador && l23 == jugador && l33 == jugador) ||
            // Diagonales
            (l11 == jugador && l22 == jugador && l33 == jugador) ||
            (l13 == jugador && l22 == jugador && l31 == jugador)) {
            return jugador;
        }
        return -1;
    }

    private static boolean hayEspacios() {
        return l11 == 0 || l12 == 0 || l13 == 0 ||
               l21 == 0 || l22 == 0 || l23 == 0 ||
               l31 == 0 || l32 == 0 || l33 == 0;
    }

    private static boolean colocarFicha(int fila, int columna, int jugador) {
        switch (fila) {
            case 1:
                if (columna == 1 && l11 == 0) { l11 = jugador; return true; }
                if (columna == 2 && l12 == 0) { l12 = jugador; return true; }
                if (columna == 3 && l13 == 0) { l13 = jugador; return true; }
                break;
            case 2:
                if (columna == 1 && l21 == 0) { l21 = jugador; return true; }
                if (columna == 2 && l22 == 0) { l22 = jugador; return true; }
                if (columna == 3 && l23 == 0) { l23 = jugador; return true; }
                break;
            case 3:
                if (columna == 1 && l31 == 0) { l31 = jugador; return true; }
                if (columna == 2 && l32 == 0) { l32 = jugador; return true; }
                if (columna == 3 && l33 == 0) { l33 = jugador; return true; }
                break;
        }
        return false;
    }

    private static void VerGato() {
        System.out.println("-------------");
        System.out.println("| " + l11 + " | " + l12 + " | " + l13 + " |");
        System.out.println("-------------");
        System.out.println("| " + l21 + " | " + l22 + " | " + l23 + " |");
        System.out.println("-------------");
        System.out.println("| " + l31 + " | " + l32 + " | " + l33 + " |");
        System.out.println("-------------");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inicializar();
        
        int turno = 1; // Jugador 1 o Jugador 2
        int ganador = -1;

        System.out.println("¡Juego del Gato iniciado!");
        System.out.println("Representación: Jugador 1 = 1, Jugador 2 = 2");

        while (ganador == -1 && hayEspacios()) {
            VerGato();
            System.out.println("\nTurno del Jugador " + turno);
            
            int fila = 0, columna = 0;
            boolean movimientoValido = false;

            while (!movimientoValido) {
                try {
                    System.out.print("Ingresa la fila (1, 2 o 3): ");
                    fila = Integer.parseInt(reader.readLine());
                    System.out.print("Ingresa la columna (1, 2 o 3): ");
                    columna = Integer.parseInt(reader.readLine());

                    movimientoValido = colocarFicha(fila, columna, turno);
                    if (!movimientoValido) {
                        System.out.println("Movimiento inválido (casilla ocupada o fuera de rango). Intenta de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println("Por favor ingresa un número válido.");
                }
            }

            ganador = verificarGanador(turno);
            
            if (ganador != -1) {
                break;
            }

            // Cambiar de turno (si es 1 pasa a 2, si es 2 pasa a 1)
            turno = (turno == 1) ? 2 : 1;
        }

        VerGato();
        
        if (ganador != -1) {
            System.out.println("\n ¡Felicidades! El Jugador " + ganador + " ha ganado la partida.");
        } else {
            System.out.println("\n ¡Empate! Ya no quedan casillas disponibles.");
        }
    }
}