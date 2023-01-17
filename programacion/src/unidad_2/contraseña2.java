/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class contraseña2 {


	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		final String contraseña = "alegard";
		String clave = "";
		
		int contador = 0;
	
		
	
		while(!clave.equals(contraseña) && contador<=2)
		//MIENTRAS EL USUARIO NO ACIERTE LA CONTRASEÑA ENTRO EN BUCLE
			
		{
			if(contador==0)
				System.out.println("Introduce tu contraseña");
			else
				System.out.println("Contraseña incorrecta. Vuelvela a escribir:");
			clave = sc.nextLine();
			System.out.println("te quedan " + (2-contador) + " intentos");
			contador++;
		}
		if (contador <=2)
			System.out.println("Contraseña correcta");
		else
			System.out.println("Contraseña incorrecta");
		

	}

}
