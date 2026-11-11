package Capitulo3;

public class ostrarMenu {
	public static String MostrarMenu(String[] opciones) {
	    String cadena = "";
	    for (String info : opciones) {
	        cadena += info + "\n";
	    }
	    return cadena;
	}

}
