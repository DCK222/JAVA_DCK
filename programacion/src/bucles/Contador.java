/**
 * 
 */
package bucles;

import java.util.Scanner;

public class Contador {


	public static void main(String[] args) {
		
		/*
		 * PEDIMOS UN NUMERO AL USUARIO
		 * MOSTRAMOS TODOS LOS NUMERO QUE HAY DESDE EL 0
		 * HASTA NUMERO SEPARADOS POR ESPACIOS
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		int contador = 0;
		
		while( contador <= numero)
		{
			System.out.print(contador + " ");
			contador ++;
		}
		
		
		
		sc.close();
		
			
		
		
		
		
		

	}

}
