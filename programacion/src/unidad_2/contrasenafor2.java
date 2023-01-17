/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class contrasenafor2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String contraseña = "alegar";
		String clave = "";
		int contador;

		for (contador=0;contador<3 && !clave.equals(contraseña);contador++)
		{
			System.out.println("Introduce contraseña");
			clave = sc.nextLine();
		}
		if(contador <=3)
			System.out.println("Contraseña correcta");
		else
			System.out.println("numero de intentos superados");
		
		
		

	}

}
