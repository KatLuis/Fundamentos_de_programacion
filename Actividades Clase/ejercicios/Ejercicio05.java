package ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio05 {
	public static void main(String[] args) throws Exception{

	BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
	System.out.println ("Ingrese el total de venta del carro de leña: "); 
	String nVenta = teclado.readLine();
	double nVentaN = Integer.parseInt(nVenta);
	double ganancia = nVentaN * 0.2;
	System.out.println ("La ganancia obtenida es: " + ganancia); 
	// TODO Auto-generated method stub

		}

	}