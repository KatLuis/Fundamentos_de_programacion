using System;

class Program
{
    static void Main(string[] args)
    {
        double interes = 0.02;
        int dias = 0;
        double capital = 0, ganancia = 0;

        Console.WriteLine("Ingrese el monto a invertir: ");
        capital = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingrese el número total de días del mes a considerar: ");
        dias = Convert.ToInt32(Console.ReadLine());

        ganancia = capital * dias * interes;

        Console.WriteLine("La ganancia por cobrar después del mes es de: " + ganancia);
    }
}