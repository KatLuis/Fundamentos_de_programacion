package practica6;

import javax.swing.JOptionPane;

public class Ejercicio04_joptionp {
    
    public static String convertirATexto(int valor) {
        return String.valueOf(valor);
    }

    public static void main(String[] args) {
        int num, dm, um, c, d, u;
        String salida;
        
        String inputStr = JOptionPane.showInputDialog(null, "Introduzca un número entre 0 y 99.999:");
        
        if (inputStr != null) {
            num = Integer.parseInt(inputStr);
            
            u = num % 10;
            num = num / 10;
            
            d = num % 10;
            num = num / 10;
            
            c = num % 10;
            num = num / 10;
            
            um = num % 10;
            num = num / 10;
            
            dm = num;
            
            salida = convertirATexto(u) + " " + convertirATexto(d) + " " + convertirATexto(c);
            salida = salida + " " + convertirATexto(um) + " " + convertirATexto(dm);
            
            num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
            
            JOptionPane.showMessageDialog(null, salida + "\n" + num);
        }
    }
}