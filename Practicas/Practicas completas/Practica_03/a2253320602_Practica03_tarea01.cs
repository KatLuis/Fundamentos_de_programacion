using System;

class a2253320602_Practica03_tarea01 {
    static void Main() {
        Console.WriteLine("Introduce la longitud total del muro (X):");
        double X = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce la altura del muro (Y):");
        double Y = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce el numero de castillos (N):");
        double N = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce la longitud de cada castillo (P):");
        double P = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce la longitud del ladrillo:");
        double Lladrillo = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce la altura del ladrillo:");
        double Aladrillo = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce el espesor de la junta vertical:");
        double Ajuntav = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce el espesor de la junta horizontal:");
        double Anjuntah = Convert.ToDouble(Console.ReadLine());
        
        double longitudEfectiva = X - (N * P);
        double areaMuro = longitudEfectiva * Y;
        double areaLadrillo = (Aladrillo + Anjuntah) * (Lladrillo + Ajuntav);
        double NL = areaMuro / areaLadrillo;
        
        Console.WriteLine("El numero de ladrillos necesarios es: " + NL);
    }
}