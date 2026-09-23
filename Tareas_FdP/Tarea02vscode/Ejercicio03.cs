using System;

class Area_Cono {
    static void Main() {
        double radio, generatriz, altura, aBase, alado, aTotal, volumen;

        Console.WriteLine("Ingrese el radio del cono: ");
        radio = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingrese la generatriz del cono: ");
        generatriz = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingrese la altura del cono: ");
        altura = Convert.ToDouble(Console.ReadLine());

        aBase = Math.PI * (radio * radio);
        alado = Math.PI * radio * generatriz;
        aTotal = aBase + alado;
        volumen = (1.0 / 3.0) * aBase * altura;

        Console.WriteLine("El área de la base es: " + aBase);
        Console.WriteLine("El área lateral es: " + alado);
        Console.WriteLine("El área total es: " + aTotal);
        Console.WriteLine("El volumen es: " + volumen);
    }
}