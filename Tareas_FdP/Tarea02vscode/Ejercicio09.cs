using System;

class Cono {
    static void Main() {
        double radio, altura, generatriz, areaLateral, areaTotal, volumen;

        Console.WriteLine("Ingrese el radio del cono: ");
        radio = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("Ingrese la altura del cono: ");
        altura = Convert.ToDouble(Console.ReadLine());

        generatriz = Math.Sqrt((radio * radio) + (altura * altura));
        areaLateral = Math.PI * radio * generatriz;
        areaTotal = Math.PI * radio * (radio + generatriz);
        volumen = (Math.PI * (radio * radio) * altura) / 3.0;

        Console.WriteLine("La generatriz es: " + generatriz);
        Console.WriteLine("El área lateral es: " + areaLateral);
        Console.WriteLine("El área total es: " + areaTotal);
        Console.WriteLine("El volumen es: " + volumen);
    }
}