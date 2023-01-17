/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class NumeroCifras {


	public static void main(String[] args) {
		
		/*PEDIMOS AL USUARIO UN NUMERO
		 * Y LE DECIMOS SI TIENE 1, 2 O MAS CIFRAS
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int numero = entrada.nextInt();
		
		if(numero<10)
			System.out.println("El numero tiene 1 cifra");
		else if(numero>=10 && numero<100)
			System.out.println("El numero tiene 2 cifras");
		else if(numero>=100 && numero<1000)
			System.out.println("El numero tiene 3 cifras");
		else
			System.out.println("El numero tiene muchas cifras");
		

	}

}
