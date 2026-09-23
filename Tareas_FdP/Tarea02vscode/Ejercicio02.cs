class Cant_Arena {
    static void Main() {
        double metros, largo, ancho, arena;
        metros = 0.5;
        
        Console.WriteLine("Ingrese el largo de la pared en metros: ");
        largo = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("Ingrese el ancho de la pared en metros: ");
        ancho = Convert.ToDouble(Console.ReadLine());
        
        arena = (largo * ancho) * metros;
        
        Console.WriteLine("La cantidad de arena necesaria es de: " + arena);
    }
}