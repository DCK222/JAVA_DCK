/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class contraseñadowhile {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String contraseña = "punchis";
		String clave = "";
		int contador = 0;
		
		do 
		{
			System.out.println("Introduce tu Contraseña");
			clave = sc.nextLine();
			
			
		}while (!clave.equals(contraseña) && contador <3);
		
		if(contador <=3)
			System.out.println("Contraseña correcta");
		else
			System.out.println("Contraseña Incorrecta");
			
		
		
	
	
	
	
		

	}

}
