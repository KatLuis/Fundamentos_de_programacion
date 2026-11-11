package Capitulo5;

public class Capitulo5MostrarProducto {

    // Función MostrarProducto: Formatea en columnas uniformes la información de un producto[cite: 162]
    public static String MostrarProducto(String[] vproducto) { 
        String codigo = RellenarEspacios(vproducto[0], 5); 
        String producto = RellenarEspacios(vproducto[1], 30); 
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        String cadena = codigo.concat(producto + precio + cantidad); 
        return cadena; 
    }
}