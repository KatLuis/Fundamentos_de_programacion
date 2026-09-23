using System;

class Triangulo {
    static void Main() {
        double x1, x2, x3, y1, y2, y3, distancia1, distancia2, distancia3, perimetro;

        Console.WriteLine("Ingresa la coordenada de x1: ");
        x1 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la coordenada de y1: ");
        y1 = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingresa la coordenada de x2: ");
        x2 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la coordenada de y2: ");
        y2 = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingresa la coordenada de x3: ");
        x3 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la coordenada de y3: ");
        y3 = Convert.ToDouble(Console.ReadLine());

        // Fórmulas de distancia y perímetro
        distancia1 = Math.Sqrt(Math.Pow((x1 - x2), 2) + Math.Pow((y1 - y2), 2));
        distancia2 = Math.Sqrt(Math.Pow((x2 - x3), 2) + Math.Pow((y2 - y3), 2));
        distancia3 = Math.Sqrt(Math.Pow((x3 - x1), 2) + Math.Pow((y3 - y1), 2));

        perimetro = distancia1 + distancia2 + distancia3;

        Console.WriteLine("El perímetro del Triangulo es: " + perimetro);
    }
}