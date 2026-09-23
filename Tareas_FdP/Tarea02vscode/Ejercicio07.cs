using System;

class Triangulo_Superficie {
    static void Main() {
        double x1, x2, x3, y1, y2, y3, area;

        Console.WriteLine("Ingresa la cordenada de x1: ");
        x1 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la cordenada de y1: ");
        y1 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la cordenada de x2: ");
        x2 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la cordenada de y2: ");
        y2 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la cordenada de x3: ");
        x3 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingresa la cordenada de y3: ");
        y3 = Convert.ToDouble(Console.ReadLine());

        area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1))) / 2.0;

        Console.WriteLine("El Área del Triangulo con respecto a sus Vertices es: " + area);
    }
}