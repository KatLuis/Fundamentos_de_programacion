using System;

class Ejercicio05 {
    static void Main() {
        double lado, aBase, alado, aTotal, volumen;

        Console.WriteLine("Ingrese el valor del lado del Hexaedro o Cubo: ");
        lado = Convert.ToDouble(Console.ReadLine());

        // Fórmulas del libro
        aBase = lado * lado;
        alado = 4 * (lado * lado);
        aTotal = 6 * (lado * lado);
        volumen = lado * lado * lado;

        Console.WriteLine("El área de la base es: " + aBase);
        Console.WriteLine("El área lateral de la base es: " + alado);
        Console.WriteLine("El área total de la base es: " + aTotal);
        Console.WriteLine("El volumen es: " + volumen);
    }
}