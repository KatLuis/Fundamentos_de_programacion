package Ejercicios;

import java.util.Scanner;

public class ejercicio04_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion; 
        double operando1, operando2, resultado;
        String cadena = "";
        
        System.out.print("Introduce el valor del operando 1: ");
        operando1 = entrada.nextDouble();
        
        System.out.print("Introduce el valor del operando 2: ");
        operando2 = entrada.nextDouble();
        
        String menu = " Menu de opciones de Operaciones Basicas \n" +
                      " 1.- Suma \n" +
                      " 2.- Multiplicacion \n" +
                      " 3.- Division \n" +
                      " Elige una Opcopn [1..2..3]: ";
        System.out.print(menu);
        opcion = entrada.nextInt();
        
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
        System.out.println(cadena);
        entrada.close();
    }
}