/**
 * 
 */
package arraysmulti;

import java.util.Scanner;

public class Rellenalamatriz {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] miMatriz = new int[4][5];
		rellenar(miMatriz);
		imprimeMatriz(miMatriz);

	}

	public static int[][] rellenar(int[][] miMatriz) {

		System.out.println("Introduce los elementos de la matriz:");

		for (int i = 0; i < miMatriz.length; i++) {

			for (int j = 0; j < miMatriz[i].length; j++) {

				System.out.println("Introduce elemento [" + i + ", " + j + " ]");

				miMatriz[i][j] = sc.nextInt();

			}

		}

		return miMatriz;

	}

	public static void imprimeMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");

			}

			System.out.println();

		}
	}
	
	public static void sumafilas( int miMatriz) {
		
		
		
		
		
		
		
	}
	
	
	
}
