/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class Mayormenor {


	public static void main(String[] args) {
		
		/*
		 * CREAMOS UN ARRAY CON LAS POSICIONES QUE NOS DIGA EL USUARIO
		 * LO RELLENAMOS CON NUMEROS ALEATORIOS
		 * HALLAMOS EL NUMERO MAYOR Y EL MENOR
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int n;
		int numero [];
		
		System.out.println("Cuantos elementos tiene el array");
		n = sc.nextInt();
		numero new int [n];
		
		
		
		
		
		for(int i = 0;i<n;++) {
			
			numeros[i] = (int)(Math.random()*10000);
			System.out.print(numeros[i]+"");
		}
		
		for (int j=0;j<n;j++) {
			
			if(mayor<numeros[j])
			mayor=numeros[j];
			if(menor>numeros[j])
				menor=numeros[j];
		}
		
			
		
		

		
		
		
		
		
		
		
		

	}

}
