package Unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio02_c {

	

	
	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
int puerto,protocolo;
BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

System.out.println("introduce el puerto de acceso");
puerto = Integer.parseInt(lectura.readLine());
System.out.println("introduce el protocolo que usas TCP[1] o UDP[2]");
protocolo = Integer.parseInt(lectura.readLine());

if( (protocolo==1)&& ((puerto==80) || (puerto==443) || (puerto==22)))
System.out.println("valido el puerto "+puerto);
else
if((protocolo==2)&& ((puerto==53) || (puerto==22)))
System.out.println("valido el puerto "+puerto);
		
		
	}

}
