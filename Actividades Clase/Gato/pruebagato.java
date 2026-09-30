package actividadesT2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pruebagato {
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

    private static int linea1(int jugador) {
        if (l11 == jugador && l12 == jugador && l13 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int linea2(int jugador) {
        if (l21 == jugador && l22 == jugador && l23 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int linea3(int jugador) {
        if (l31 == jugador && l32 == jugador && l33 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int vertical1(int jugador) {
        if (l11 == jugador && l21 == jugador && l31 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int vertical2(int jugador) {
        if (l12 == jugador && l22 == jugador && l32 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int vertical3(int jugador) {
        if (l13 == jugador && l23 == jugador && l33 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int diagonal1(int jugador) {
        if (l11 == jugador && l22 == jugador && l33 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static int diagonal2(int jugador) {
        if (l13 == jugador && l22 == jugador && l31 == jugador) {
            return jugador;
        } else {
            return -1;
        }
    }

    private static boolean Esvacio(int fila, int columna) {
        boolean vacio = false;
        int valorcasilla = -1;

        if (((fila > 0) && (fila < 4)) && ((columna > 0) && (columna < 4))) {
            if ((fila == 1) && (columna == 1)) {
                valorcasilla = l11;
            } else if ((fila == 1) && (columna == 2)) {
                valorcasilla = l12;
            } else if ((fila == 1) && (columna == 3)) {
                valorcasilla = l13;
            } else if ((fila == 2) && (columna == 1)) {
                valorcasilla = l21;
            } else if ((fila == 2) && (columna == 2)) {
                valorcasilla = l22;
            } else if ((fila == 2) && (columna == 3)) {
                valorcasilla = l23;
            } else if ((fila == 3) && (columna == 1)) {
                valorcasilla = l31;
            } else if ((fila == 3) && (columna == 2)) {
                valorcasilla = l32;
            } else if ((fila == 3) && (columna == 3)) {
                valorcasilla = l33;
            }
        }

        if (valorcasilla == 0) {
            vacio = true;
        }
        
        return vacio;
    }

    private static boolean Agregar(int fila, int columna, int jugador) {
        boolean vacio = false;

        if (((fila > 0) && (fila < 4)) && ((columna > 0) && (columna < 4))) {
            if ((fila == 1) && (columna == 1) && (l11 == 0)) {
                l11 = jugador;
                vacio = true;
            } else if ((fila == 1) && (columna == 2) && (l12 == 0)) {
                l12 = jugador;
                vacio = true;
            } else if ((fila == 1) && (columna == 3) && (l13 == 0)) {
                l13 = jugador;
                vacio = true;
            } else if ((fila == 2) && (columna == 1) && (l21 == 0)) {
                l21 = jugador;
                vacio = true;
            } else if ((fila == 2) && (columna == 2) && (l22 == 0)) {
                l22 = jugador;
                vacio = true;
            } else if ((fila == 2) && (columna == 3) && (l23 == 0)) {
                l23 = jugador;
                vacio = true;
            } else if ((fila == 3) && (columna == 1) && (l31 == 0)) {
                l31 = jugador;
                vacio = true;
            } else if ((fila == 3) && (columna == 2) && (l32 == 0)) {
                l32 = jugador;
                vacio = true;
            } else if ((fila == 3) && (columna == 3) && (l33 == 0)) {
                l33 = jugador;
                vacio = true;
            }
        }

        return vacio;
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

    private static int verificarGanador(int jugador) {
        if (linea1(jugador) == jugador || linea2(jugador) == jugador || linea3(jugador) == jugador ||
            vertical1(jugador) == jugador || vertical2(jugador) == jugador || vertical3(jugador) == jugador ||
            diagonal1(jugador) == jugador || diagonal2(jugador) == jugador) {
            return jugador;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inicializar();
        
        int turno = 1; 
        int movimientos = 0;
        boolean hayGanador = false;

        System.out.println("¡Bienvenido al juego del Gato!");

        while (movimientos < 9 && !hayGanador) {
            VerGato();
            System.out.println("Turno del Jugador " + turno + " (Representado con el número " + turno + ")");
            
            System.out.print("Ingresa la fila (1-3): ");
            int fila = Integer.parseInt(reader.readLine());
            
            System.out.print("Ingresa la columna (1-3): ");
            int columna = Integer.parseInt(reader.readLine());

            if (Agregar(fila, columna, turno)) {
                if (verificarGanador(turno) == turno) {
                    hayGanador = true;
                    VerGato();
                    System.out.println("¡Felicidades! El Jugador " + turno + " ha ganado.");
                } else {
                    turno = (turno == 1) ? 2 : 1;
                    movimientos++;
                }
            } else {
                System.out.println("Movimiento inválido o casilla ocupada. Intenta de nuevo.");
            }
        }

        if (!hayGanador) {
            VerGato();
            System.out.println("¡Empate! Se acabaron las casillas.");
        }
    }
}