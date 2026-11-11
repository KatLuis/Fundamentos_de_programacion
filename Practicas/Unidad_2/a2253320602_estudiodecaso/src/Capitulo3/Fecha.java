package Capitulo3;

public class Fecha {
	public static String Fecha() {
	    Date fecha = new Date();
	    SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
	    return formatodia.format(fecha);
	}

}