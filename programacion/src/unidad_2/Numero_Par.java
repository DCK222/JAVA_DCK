/**
 * 
 */
package unidad_2;

import java.util.Scanner;

/*PEDIR AL USUARIO UN NUMERO ENTERO
 * Y DECIR SI ES PAR. EN CASO CONTRARIO NO DECIR NADA.
 */

public class Numero_Par {

	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce numero entero");
		int numero = entrada.nextInt();
		
		if (numero%2==0) {
			
			System.out.println("El numero " + numero + " es par");
			
		}
		else 
			System.out.println("El numero" + numero + " es impar");
		
		
		
		
		
		
		
		
	
		
		
	}

}
