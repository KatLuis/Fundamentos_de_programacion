package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio01 {

	public static void main(String[] args) throws Exception {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Introduce el valor del numero a calcular el cuadrado:  ");
	String nCualquiera = teclado.readLine();
	int nCualCon = Integer.parseInt(nCualquiera);
	int cuadradoFinal = nCualCon * nCualCon;
	System.out.println("El cuadrado de tu numero es; " + cuadradoFinal);


	// TODO Auto-generated method stub4
	}

}
