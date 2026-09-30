package ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio03 {

	public static void main(String[] args) throws Exception {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Introduce el numero de obreros: "); 
		String nObreros = teclado.readLine();
		System.out.println ("Introduce el numero de dias: "); 
		String nDias = teclado.readLine();
		double nObrerosN = Integer.parseInt(nObreros);
		double nDiasN = Integer.parseInt(nDias);
		double nMotores = nObrerosN * nDiasN / 16;
		System.out.println (nObreros+" obreros ensamblarian  "+nMotores+" motores por "+nDias+" dias."); 
		// TODO Auto-generated method stub

	}

}
