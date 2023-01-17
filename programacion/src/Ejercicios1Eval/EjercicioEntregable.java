/**
 * 
 */
package Ejercicios1Eval;

import java.util.Scanner;

public class EjercicioEntregable {


	public static void main(String[] args) {
		
		
		/* EJERCICIO 1
		*  USAMOS SCANNER, STRING ADEMAS DE LA EXTENSION NEXTLINE Y
		*  FINALMENTE CERRAMOS EL SCANNER
		*  
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		entrada.close();
		
		
		
		
		
		/* EJERCICIO 2
		 * UTILIZAMOS LAS VARIABLES INT PARA NUMEROS ENTEROS
		 */
		
		int numero = 2;
		int total = numero + numero;
		
		System.out.println("2 + 2 =" + total);
		
		
		
		
		/* EJERCICIO 3
		 *VARIABLES DE TIPO INT PARA NUMEROS ENTEROS COMO SE ESPECIFICA
		 *EN EL ENUNCIADO
		 * 
		 */
		
		
		int num1 = 5;
		int num2 = 8;
		
		System.out.println("num1= " + num1 + " y " + "num2= " + num2);
		System.out.println("num1= " + num2 + " y " + " num2= " + num1);
		
		
		
		/* EJERCICIO 4
		 * SE USAN VARIABLES DE TIPO DOUBLE ADEMAS DE LA APROXIMACION DE DOS DECIMALES
		 * COMO SE ESPECIFICA EN ELENUNCIADO
		 */
			
		
		double num5 = 6.5;
		double num6 = 7.8;
		double multiplicacion = (num5 * num6);
		
		System.out.printf("%.2f" , multiplicacion );
		
		
		
		/* EJERCICIO 5
		 * SE UTILIZAN VARIABLES DOUBLE PARA APROXIMAR
		 */
		
		
		
		double num9 = 2;
		double num4 = 5;
		
		System.out.println("5 : 2 = " + num4 / num9);
		
		
		
		
		/* EJERCICIO 6
		 * UTILIZAMOS LAS VARIABLES INT Y LA VARIABLE DOUBLE PARA 
		 * LOS DECIMALES Y LA APROXIMACION DE DECIMALES %1.f
		 */
		
		
		int n1 = 5;
		int n2 = 2;
		double division = (double) n1 / n2 ;
		
		System.out.println("n1 = 1  \n" + "n2 = 2");
		System.out.printf("n1 /n2 = " + "%.1f" , division);
		


		/*EJERCICIO 7
		 * UTILIZAMOS STRING ADEMAS DE INT Y LA EXTENSION PARSEINT CONSULTADA EN LA 
		 * API DE JAVA
		 */
		
		
		String numerotexto = "100";
		int masuno = Integer.parseInt(numerotexto) + 1;
		
		System.out.println(masuno);
		
		
		
		
		/*EJERCICIO 8
		 * UTILIZAMOS BYTE COMO NOS DICE EN EL ENUNCIADO Y UTILIZAMOS LAS VARIABLES INT
		 * PARALOS NUMEROS ENTEROS
		 */
		
		
		byte dato1 = 4;
		byte dato2 = 2;
		
		int suma = (dato1 + dato2);
		int resta = (dato1 - dato2);
		int multiplicacion1 = (dato1 * dato2);
		int division1 = (dato1 / dato2);
		
		System.out.println("\n 4 + 2 = " + suma + "\n 4 - 2 = " + resta + 
				"\n 4 * 2 = " + multiplicacion1 + "\n 4 / 2 = " + division);
		
		
		
		
		/*  EJERCICIO 9
		 *  UTILIZAMOS LA VARIABLE INT PARA LOS NUMEROS ENTEROS
		 * 
		 */
		
		int numero1 = 45 / 10;
		int numero2 = 45 % 10;
		
		System.out.println(" 45 / 10 = " + numero1 + "\n 45 % 10 = " + numero2);
		
		/*la utilidad de / es dividir y redondear a la baja los numero enteros
		 * al ser la variable int y % lo que hace es redondear a la alza. 
		 */
		
		
		
		
		
		
		/* EJERCICIO 10
		 * UTILIZAMOS SCANNER CON VARIABLE INT PARA LA EDAD Y CON VARIABLE DOUBLE PARA EL PESO
		 * 
		 */

		      Scanner sc = new Scanner(System.in);
		
		      System.out.println("Introduce tu edad = ");
		      int edad = sc.nextInt();
				
		      System.out.println("Introduce tu peso = ");
		      double kg = sc.nextDouble();
		      
		      System.out.println("Con un año más tendrás " + (edad + 1) + " años " + 
		      "y el doble de tu peso sería " + (kg * 2) + " kg ");
		      
		      sc.close();
		      
		   	

	}

}
