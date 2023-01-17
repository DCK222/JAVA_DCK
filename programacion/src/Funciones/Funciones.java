/**
 * 
 */
package Funciones;

import java.util.Scanner;

public class Funciones {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2 = sc.nextInt();
		
		int suma = suma(num1, num2);
		System.out.println("la suma es " + suma);
		
	}
	
	public static int suma(int a, int b) {
		
		
		int resultado = a + b;
		return resultado;
		

	}

	
	//CREA UNA FUNCION QUE HAGA LA RESTA DE DOS DOUBLE
	
	public static double Resta(double x, double y) {
		returm x-y;
	}
	
	
	
}



 
