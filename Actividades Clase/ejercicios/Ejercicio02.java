package ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio02 {

	public static void main(String[] args) throws Exception{
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Introduce el numero de sastres: ");
		String nSastres = teclado.readLine();
		double nSastresNum = Integer.parseInt(nSastres);
		double nPantalones = nSastresNum * 45 / 25;
		System.out.println ("Por : " + nSastres + " sastres harian " + nPantalones + " pantalones.");
		// TODO Auto-generated method stub8
	}

}
