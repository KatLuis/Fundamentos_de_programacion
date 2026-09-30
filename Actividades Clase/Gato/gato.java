package actividadesT2;
import java.util.Scanner;

public class gato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String c1 = "1", c2 = "2", c3 = "3";
        String c4 = "4", c5 = "5", c6 = "6";
        String c7 = "7", c8 = "8", c9 = "9";
        
        String turno = "X";
        String ganador = "";
        boolean hayGanador = false;
        int i = 1;

        while (i <= 9 && !hayGanador) {
            // Imprimir tablero
            System.out.println("\n " + c1 + " | " + c2 + " | " + c3);
            System.out.println("---+---+---");
            System.out.println(" " + c4 + " | " + c5 + " | " + c6);
            System.out.println("---+---+---");
            System.out.println(" " + c7 + " | " + c8 + " | " + c9);

            System.out.println("\nTurno de " + turno + ". Elige casilla (1-9): ");
            int opcion = scanner.nextInt();

            // Estructura Switch (Casos)
            switch (opcion) {
                case 1: c1 = turno; break;
                case 2: c2 = turno; break;
                case 3: c3 = turno; break;
                case 4: c4 = turno; break;
                case 5: c5 = turno; break;
                case 6: c6 = turno; break;
                case 7: c7 = turno; break;
                case 8: c8 = turno; break;
                case 9: c9 = turno; break;
            }

            // Comprobar filas
            if ((c1.equals(turno) && c2.equals(turno) && c3.equals(turno)) ||
                (c4.equals(turno) && c5.equals(turno) && c6.equals(turno)) ||
                (c7.equals(turno) && c8.equals(turno) && c9.equals(turno))) {
                hayGanador = true;
            }
            // Comprobar columnas
            if ((c1.equals(turno) && c4.equals(turno) && c7.equals(turno)) ||
                (c2.equals(turno) && c5.equals(turno) && c8.equals(turno)) ||
                (c3.equals(turno) && c6.equals(turno) && c9.equals(turno))) {
                hayGanador = true;
            }
            // Comprobar diagonales
            if ((c1.equals(turno) && c5.equals(turno) && c9.equals(turno)) ||
                (c3.equals(turno) && c5.equals(turno) && c7.equals(turno))) {
                hayGanador = true;
            }

            // === AQUÍ ESTÁ EL CAMBIO CLAVE ===
            if (hayGanador) {
                ganador = turno;
                break; // Corta el ciclo WHILE inmediatamente para NO volver a pedir datos
            }

            // Cambiar turno sólo si no hubo ganador
            if (turno.equals("X")) {
                turno = "O";
            } else {
                turno = "X";
            }
            i++;
        }

        // Mostrar tablero final
        System.out.println("\n " + c1 + " | " + c2 + " | " + c3);
        System.out.println("---+---+---");
        System.out.println(" " + c4 + " | " + c5 + " | " + c6);
        System.out.println("---+---+---");
        System.out.println(" " + c7 + " | " + c8 + " | " + c9 + "\n");

        // Anunciar resultado
        if (hayGanador) {
            System.out.println("¡FELICIDADES! El ganador es el jugador: " + ganador);
        } else {
            System.out.println("¡ES UN EMPATE! Nadie ganó.");
        }

        scanner.close();
    }
}
