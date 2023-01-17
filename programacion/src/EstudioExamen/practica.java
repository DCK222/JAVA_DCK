package EstudioExamen;

import java.util.Arrays;
import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		
		String mundo [][] ={{"America","Europa","Asia"},{"Mexico","España","Buenos Aires"}};
		tabla(mundo);
		
		}


public static void tabla (String n[][]) {
	
	int fila;
	int columna;
	
	for (int fila1 = 0; fila1 < n.length; fila1++) {
		
		for (int columna1 = 0; columna1 < n[fila1].length; columna1++) {
			System.out.print(n[fila1][columna1]+"\t");
			
		}
	System.out.println();
	}
	
	
}



}
