/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class DimeQueSi {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿estamos en octubre?");
		String resp = entrada.nextLine();
		
		if (resp.equalsIgnoreCase("si")) {
			System.out.println("Exacto");
			
		}
		else 
			System.out.println("Eres tonto");
		
		
		
		

	}

}
