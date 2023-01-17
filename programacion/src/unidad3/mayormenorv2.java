/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class mayormenorv2 {


	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int n;
		
		
		System.out.println("Cuantos elementos tiene el array");
		n = sc.nextInt();
		int[] numero = new int [n];
		
		
		
		
		
		for(int i = 0;i<n;++) {
			
			numero[i] = (int)(Math.random()*10000)
			System.out.print(numero[i]+"");
		}
		
		for (int j=0;j<n;j++) {
			
			if(mayor<numero[j])
			mayor=numeros[j];
			if(menor>numero[j])
				menor=numero[j];
		}
		
		

	}

}
