/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class Edadv3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos años tienes?");
		int edad = entrada.nextInt();
		
		if(edad<18)
			System.out.println("eres joven");
		else if(edad>=18 && edad<=60)
			System.out.println("eres adulto");
		else if(edad>60 && edad<=75)
			System.out.println("eres maduro");
		else
			System.out.println("Cuidate");
		
		
		

	}

}
