using System;

class Paralelepipedo {
    static void Main() {
        double largo, ancho, altura, area, volumen;

        Console.WriteLine("Ingrese el largo: ");
        largo = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingrese el ancho: ");
        ancho = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingrese la altura: ");
        altura = Convert.ToDouble(Console.ReadLine());

        area = 2 * ((largo * ancho) + (largo * altura) + (ancho * altura));
        volumen = largo * ancho * altura;

        Console.WriteLine("El área total es: " + area);
        Console.WriteLine("El volumen es: " + volumen);
    }
}