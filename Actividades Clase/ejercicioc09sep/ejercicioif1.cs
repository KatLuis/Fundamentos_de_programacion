using System;

class Program
{
    static void Main(string[] args)
    {
        int n;
        int npar = 0;   // Inicializamos las variables contadoras en 0
        int nimpar = 0;

        // 
        Console.WriteLine("introduce el numero 1 entero positivo");
        n = Convert.ToInt32(Console.ReadLine());
        if (n > 0)
        {
            if (n % 2 == 0)
            {
                npar = npar + 1;
            }
            else
            {
                nimpar = nimpar + 1;
            }
        }

        // 
        Console.WriteLine("introduce el numero 2 entero positivo");
        n = Convert.ToInt32(Console.ReadLine());
        if (n > 0)
        {
            if (n % 2 == 0)
            {
                npar = npar + 1;
            }
            else
            {
                nimpar = nimpar + 1;
            }
        }

        // 
        Console.WriteLine("introduce el numero 3 entero positivo");
        n = Convert.ToInt32(Console.ReadLine());
        if (n > 0)
        {
            if (n % 2 == 0)
            {
                npar = npar + 1;
            }
            else
            {
                nimpar = nimpar + 1;
            }
        }

        // 
        Console.WriteLine("introduce el numero 4 entero positivo");
        n = Convert.ToInt32(Console.ReadLine());
        if (n > 0)
        {
            if (n % 2 == 0)
            {
                npar = npar + 1;
            }
            else
            {
                nimpar = nimpar + 1;
            }
        }

        // 
        Console.WriteLine("introduce el numero 5 entero positivo");
        n = Convert.ToInt32(Console.ReadLine());
        if (n > 0)
        {
            if (n % 2 == 0)
            {
                npar = npar + 1;
            }
            else
            {
                nimpar = nimpar + 1;
            }
        }

        // Resultados finales
        Console.WriteLine("fueron " + npar + " numeros par");
        Console.WriteLine("fueron " + nimpar + " numeros impar");
    }
}