package Capitulo5;

public class Capitulo5ExisteProducto {

    // Función ExisteProducto: Localiza un producto en el arreglo por su código y retorna su posición[cite: 166, 167]
    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc, pos, tam, ciclo;
        enc = -1;
        pos = 0;
        tam = vproductos.length;
        for (ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = pos;
            }
            pos++;
        }
        return enc;
    }
}