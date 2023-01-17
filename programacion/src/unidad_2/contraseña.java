/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class contraseña {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String contraseña = "alegard";
		String clave = "";
		
		int contador = 0;
	
		
	
		while(!clave.equals(contraseña) && contador<=2);
		//MIENTRAS EL USUARIO NO ACIERTE LA CONTRASEÑA ENTRO EN BUCLE
			
		{
			System.out.println("Introduce tu contraseña");
			clave = sc.nextLine();
			contador++;
		}
		if (contador <=2)
			System.out.println("Contraseña correcta");
		else
			System.out.println("Contraseña incorrecta");
			
		
		
		
		System.out.println("Contraseña correcta");
		

	}

}
