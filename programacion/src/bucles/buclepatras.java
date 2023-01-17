/**
 * 
 */
package bucles;

import java.util.Scanner;

public class buclepatras {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		int contador = 0;
		
		while (numero >= 0 )
			{
			System.out.print(numero + " ");
			numero --;
			}
			
		sc.close();
	}

}
