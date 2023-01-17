/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class OperadorTernario {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int numero1 = entrada.nextInt();
		
		System.out.println("escribe otro numero");
		int numero2 = entrada.nextInt();
		
		int mayor = numero1 > numero2 ? numero1:numero2;
		
		
		if(numero1==numero2)
			System.out.println("ERROR");
		else
			System.out.println("El numero mayor es " + mayor);
		
		
		

		
		
		

		
		
		
		

	}

}
