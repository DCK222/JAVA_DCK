/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class arrayalreves {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		String semana [] = new String [7];
		
		for(int i=0 ;i<semana.length; i ++) 
		{
		System.out.println("Dime el nombre del dia" + (i+1) + " dela semana");	
		semana[i] = sc.nextLine();
			
		}
		
		//Mostramos por la pantalla los dias de la semana
		
		for(int i=0;i<semana.length;i++)
		{
			System.out.println(semana[i] + " ");
		}
		sc.close();
		
		
		

	}

}
