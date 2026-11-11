package Capitulo3;

public class RellenarEspacios {
	public static String RellenarEspacios(String dato, int tamano) {
	    String cadena;
	    cadena = dato;
	    for (int ciclo = dato.length(); ciclo < tamano; ciclo++) {
	        cadena = cadena + " ";
	    }
	    return cadena;
	}

}