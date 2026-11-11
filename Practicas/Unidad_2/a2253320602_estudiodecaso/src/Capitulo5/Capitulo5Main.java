package Capitulo5;

public class Capitulo5Main {
	public static String DesplegarMenu(String Titulol, String[] menu) throws IOException {
	    String cadena;
	    cadena = Titulol + "\n" + "\n";
	    cadena = cadena + MostrarMenu(menu);
	    cadena = cadena + "\n Que opcion deseas";
	    return Dialogo(cadena);
	}

}