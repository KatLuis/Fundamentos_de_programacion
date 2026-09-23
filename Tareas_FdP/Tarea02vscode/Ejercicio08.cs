using System;

class Cilindro {
    static void Main() {
        double radio, altura, area, volumen;

        Console.WriteLine("Ingrese el radio del cilindro: ");
        radio = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Ingrese la altura del cilindro: ");
        altura = Convert.ToDouble(Console.ReadLine());

        area = 2 * Math.PI * radio * (radio + altura);
        volumen = Math.PI * Math.Pow(radio, 2) * altura;

        Console.WriteLine("El área del cilindro es: " + area);
        Console.WriteLine("El volumen del cilindro es: " + volumen);
    }
}