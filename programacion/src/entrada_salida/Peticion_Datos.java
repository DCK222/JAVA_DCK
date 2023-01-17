/**
 * 
 */
package entrada_salida;

import java.util.Scanner;

public class Peticion_Datos {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		
		System.out.println("introduce tu edad");
		int edad = entrada.nextInt();
		
		
		System.out.println("Hola " + nombre + " .Tienes " + edad + " años");
		
		System.out.println("En que anyo estamos? :");
		int anyos = entrada.nextInt();
		
		//System.out.println("Hola " + nombre " .tienes" + edad + " años y naciste en " + (anyos-edad));
		
		 
		
		
		

	}

}
