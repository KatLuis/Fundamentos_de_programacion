using System;

class Esfera {
    static void Main() {
        double radio, area, volumen;

        Console.WriteLine("Ingrese el radio de la esfera: ");
        radio = Convert.ToDouble(Console.ReadLine());

        area = 4 * Math.PI * (radio * radio);
        volumen = (4 * Math.PI * (radio * radio * radio)) / 3.0;

        Console.WriteLine("El área de la esfera es: " + area);
        Console.WriteLine("El volumen de la esfera es: " + volumen);
    }
}