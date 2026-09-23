using System;

class a2193330234_Practica01_Ejercicio2 {
    static void Main() {
        Console.WriteLine("Introduce la longitud de la losa (X):");
        double X = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce el ancho de la losa (Y):");
        double Y = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Introduce el espesor de la losa (N):");
        double N = Convert.ToDouble(Console.ReadLine());
        
        double volumen = X * Y * N;
        double cemento = volumen * 7;
        double arena = volumen * 0.52;
        double grava = volumen * 0.82;
        double agua = volumen * 200;
        
        Console.WriteLine("Volumen total de la losa: " + volumen + " m3");
        Console.WriteLine("Cemento necesario (bultos): " + cemento);
        Console.WriteLine("Arena necesaria (m3): " + arena);
        Console.WriteLine("Grava necesaria (m3): " + grava);
        Console.WriteLine("Agua necesaria (litros): " + agua);
    }
}