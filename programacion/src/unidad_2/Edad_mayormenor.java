/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class Edad_mayormenor {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hola, ¿Cuantos años tienes?");
		int n = entrada.nextInt();
		
		
		if (n>=18){
			
			System.out.println("Eres adulto/joven");
		}
		else if (n<18) {
			System.out.println("Eres joven");
		}
		
		if (n>=50) {
			
			System.out.println("Eres adulto");
		}
		else if (n>=60) {
			
			System.out.println("estas cocido");
		}
		
		
		

	}

}
