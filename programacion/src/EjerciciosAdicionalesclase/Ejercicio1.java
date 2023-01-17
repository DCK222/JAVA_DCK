package EjercicioEntregable4;

import java.util.Scanner;

public class Buscaminas {
	
	
	static int contador=0;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// DECLARAMOS SCANNER
		

		String[][] matriz = new String[5][5]; // DECLARAMOS MATRIZ 5X5
		int i = 0; // VARIABLES I,J
		int j = 0;
		
		
		; // DECLARAMOS CONTADOR

		for (i = 0; i < matriz.length; i++) { // RECORRE FILAS

			for (j = 0; j < matriz[i].length; j++) {// RECORRE COLUMNAS

				System.out.println("Introduzca coordenada (" + i + "," + j + ")"); // SYSO INTRODUCIR CORDENADAS
				matriz[i][j] = sc.nextLine();// QUE SE REGISTRE EN EL SCANNER

			}

		}

		imprimeMatriz(matriz);// IMPRIME MATRIZ

		System.out.println("Ahora introduce una cordenada. ");// SYSO

		System.out.println("Fila: ");// SYSO

		int fila = sc.nextInt(i); // QUE REGISTRE LA POSICION DE LA CORDENADA FILA

		System.out.println("Columna: ");// SYSO

		int columna = sc.nextInt(j); // REGISTRA LA CORDENADA COLUMNAS

		filaArriba(matriz, fila, columna + contador); //

	}

	public static String[][] imprimeMatriz(String[][] matriz) { // CREAMOS UNA FUNCION

		for (int i = 0; i < matriz.length; i++) { //RECORRE FILAS

			for (int j = 0; j < matriz[i].length; j++) {//RECORRE COLUMNAS

				System.out.print(matriz[i][j] + " "); //PRINTEA

			}

			System.out.println();// QUE ORDENE LA MATRIZ

		}
		return matriz; //HACEMOS UN RETURN MATRIZ

	}

	public static String[][] filaArriba(String matriz[][], int fila, int columna) {//CREAMOS UNA NUEVA CLASE

		
		
		
		if (fila >= 0) {

			for (int i = fila + 1; i < fila; i++) {

				if (matriz[i][0].equals("*")) {

					contador++;
				}

			}

			if (fila >= 0) {

				for (int i = fila - 1; i < fila; i++) {

					if (matriz[i][0].equals("*")) {
						
						contador++;
					}

				}
			}

		}

		if (columna >= 0) {

			for (int j = columna - 1; j <= columna + 1; j++) {

				if (matriz[0][j].equals("*")) {

					contador++;
				}

			}

		}
		
		

		System.out.println("Tu cordenada tiene cerca: " + contador + " minas ");
		
		return matriz;

	}

}
		

	


