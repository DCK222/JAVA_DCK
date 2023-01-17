/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class segundoejarray {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String semana [] = new String[7];



		//pedimos al usuario los nombres de los 7 días

		//y los guardamos dentro del array

		for(int i=0;i<semana.length;i++)

		{

		System.out.println("Dime el nombre del dia " + (i+1) + " de la semana");

		semana[i] = sc.nextLine();

		}


		for(int i=0;i<semana.length;i++)

		{

		System.out.print(semana[i] + " ");

		}

		System.out.println();


		for(int j=semana.length-1;j>=0;j--)

		{

		System.out.print(semana[j] + " ");

		}
		
		
		

		
		

	}

}
