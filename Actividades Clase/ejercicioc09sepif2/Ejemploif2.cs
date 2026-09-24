using System;

class Program
{
    static void Main(string[] args)
    {
        // Definir a, b, c Como Entero
        int a, b, c;
        // Definir x1, x2, d Como Real
        double x1, x2, d;

        Console.WriteLine("introduce el coeficiente numero 1 ");
        a = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("introduce el coeficiente numero 2 ");
        b = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("introduce el coeficiente numero 3 ");
        c = Convert.ToInt32(Console.ReadLine());

        // d = ((b*b) - 4*a*c)
        d = ((b * b) - 4 * a * c);

        if (d > 0)
        {
            // x1 = (-b + RAIZ(d)) / (2*a)
            x1 = (-b + Math.Sqrt(d)) / (2 * a);

            // x2 = (-b - RAIZ(d)) / (2*a)
            x2 = (-b - Math.Sqrt(d)) / (2 * a);

            Console.WriteLine("la solucion de x1 " + x1 + " y la de X2 " + x2);
        }
        else
        {
            Console.WriteLine(" no existe soluciones reales");
        }
    }
}