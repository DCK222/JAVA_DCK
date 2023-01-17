package arraysmulti;

import java.util.Scanner;

public class RellenaArrayconcordenadas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce filas");
		int filas = sc.nextInt();
		System.out.println("Introduce columnas");
		int columnas = sc.nextInt();
		
		
		int [][] mimatriz = rellenar (filas, columnas);
				 
				 
			 }
			
		public static int [][]  rellenar (int filas , int columnas )	{
			
			int [][] matriz = new int [filas][columnas];
			
			for (int i=0; i <matriz.length;i++) { //RECORRE FILAS
			
				
				for(int j=0; j <matriz[i].length;j++) //COLUMNAS
					
					System.out.print(matriz [i][j] + " ");
				
				
				
			}
			
			return matriz;
			
			
		}
			
			
		public static void imprimeMatriz(int [][]matriz) {

			for (int i = 0; i < matriz.length; i++) { 

			for (int j = 0; j < matriz[i].length; j++) { 

			System.out.print(matriz[i][j] + " ");

			}

			System.out.println();

			}
			
			
		}
		
		
		

	}


