package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio04_c {
    public static void main(String[] args) {
        double operando1, operando2, resultado;
        String cadena = "";
        
        operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 1:"));
        operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 2:"));
        
        String menu = " Menu de opciones de Operaciones Basicas \n" +
                      " 1.- Suma \n" +
                      " 2.- Multiplicacion \n" +
                      " 3.- Division \n" +
                      " Elige una Opcion [1..2..3]";
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opcion) {
            case 1: 
                resultado = operando1 + operando2;
                cadena = "El resultado de la suma es " + resultado; 
                break;
            case 2: 
                resultado = operando1 * operando2;
                cadena = "El resultado de la multiplicacion es: " + resultado; 
                break;
            case 3: 
                if(operando2 != 0) {
                    resultado = operando1 / operando2;
                    cadena = "El resultado de la division es " + resultado;
                } else {
                    cadena = "Error: Division entre cero no permitida";
                }
                break;
            default: 
                cadena = "Opcion no reconocida";
                break;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}