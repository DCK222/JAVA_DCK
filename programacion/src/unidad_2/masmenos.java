/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class masmenos {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);	
		
		int valor = (int)(Math.random()*100);
		int num_usuario = -3;
		boolean acierto = false;
		
		while(valor!=num_usuario && acierto==false) {
			
			System.out.println("Introduce un numero");
			num_usuario = sc.nextInt();
			
			if(valor>num_usuario)
				System.out.println("El numero es mayor");
			else if (valor<num_usuario)
				System.out.println("el numero es menor");
			else
				acierto=true;
		}
		System.out.println("Acierto");
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
