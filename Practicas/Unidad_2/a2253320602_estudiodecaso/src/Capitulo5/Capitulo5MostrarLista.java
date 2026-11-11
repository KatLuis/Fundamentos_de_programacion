package Capitulo5;

public class Capitulo5MostrarLista {

    // Función MostrarLista: Recorre la matriz y genera la lista completa formateada de todos los productos[cite: 164, 165]
    public static String MostrarLista(String[][] vproductos) 
    {
        String salida = "";
        for (int ciclo = 0; ciclo < 10; ciclo++) 
        { 
            String[] vproducto = { vproductos[ciclo][0], vproductos[ciclo][1], vproductos[ciclo][2], vproductos[ciclo][3] }; 
            String cadena = MostrarProducto(vproducto); 
            salida = salida.concat(cadena + "\n"); 
        } 
        return salida; 
    }
}
