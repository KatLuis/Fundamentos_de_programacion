package Practica_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a2253320602_Practica03_tarea01 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce la longitud total del muro (X):");
        double X = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce la altura del muro (Y):");
        double Y = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce el numero de castillos (N):");
        double N = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce la longitud de cada castillo (P):");
        double P = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce la longitud del ladrillo:");
        double Lladrillo = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce la altura del ladrillo:");
        double Aladrillo = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce el espesor de la junta vertical:");
        double Ajuntav = Double.parseDouble(entrada.readLine());
        
        System.out.println("Introduce el espesor de la junta horizontal:");
        double Anjuntah = Double.parseDouble(entrada.readLine());
        
        double longitudEfectiva = X - (N * P);
        double areaMuro = longitudEfectiva * Y;
        double areaLadrillo = (Aladrillo + Anjuntah) * (Lladrillo + Ajuntav);
        double NL = areaMuro / areaLadrillo;
        
        System.out.println("El numero de ladrillos necesarios es: " + NL);
    }
}