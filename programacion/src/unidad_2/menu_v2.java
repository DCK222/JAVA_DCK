/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class menu_v2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("   Menu   ");
		System.out.println("1.Cuadrado");
		System.out.println("2.Rectangulo");
		System.out.println("3.Triangulo");
		System.out.println("4.Circulo");
		int opcion = sc.nextInt();
		
		if(opcion<1 || opcion>4)
		{
			System.out.println("Eres tonto no ves las opciones");
			
		}
		else if(opcion == 1)
		{
			System.out.println("introduce el lado del cuadrado");
			double lado = sc.nextDouble();
			System.out.println(lado * lado);
		}
		else if(opcion == 2)
		{
			System.out.println("Introduce la base del rectangulo");
			double base = sc.nextDouble();
			System.out.println("introduce la atura rey");
			double altura = sc.nextDouble();
			System.out.println(" el area del rectangulo es ");
		}
		
		else if(opcion == 3);
		{
			
		}
		
		
		
		
		
		
		
		
		
			
		
		
		

	}

}
