using System;

class Esfera {
    static void Main() {
        double radio, area, volumen;

        Console.WriteLine("Ingrese el valor del radio de la esfera: ");
        radio = Convert.ToDouble(Console.ReadLine());

        // Fórmulas del libro
        area = (4 * Math.PI) * (radio * radio);
        volumen = ((4 * Math.PI) * (radio * radio * radio)) / 3.0;

        Console.WriteLine("El resultado del área de la esfera es: " + area);
        Console.WriteLine("El resultado del Volumen de la esfera es: " + volumen);
    }
}