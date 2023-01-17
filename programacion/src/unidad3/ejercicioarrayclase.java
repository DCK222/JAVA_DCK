/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class ejercicioarrayclase {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de elementos de tu array");
		int num = sc.nextInt();
		
		int numeros [] = new int [num];
		
		numeros [1] = 2;
		numeros [2] = numeros[1];	
		numeros [0] = numeros [1] + numeros[2];
		numeros [0]++;
		numeros [3] = num + 10;
		numeros [numeros.length-1] = numeros[0];
		
		for( int i = 0; i < numeros.length; i ++ ) {
		/*System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println(numeros[4]);
		*/
		System.out.print(numeros[i] + " ");
		}
		
		sc.close();
		

	}

}
