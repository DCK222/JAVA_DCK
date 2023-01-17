/**
 * 
 */
package bucles;

import java.util.Scanner;

public class Contraseña {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la contraseña");
		int acierto = sc.nextInt();
		final String contraseña = "Holasoylola";
		
		while(acierto)
			{
			System.out.print(acierto + "");
			acierto ++;
			}
		
			
		
		

	}

}
