package Unidad5;

import java.util.Scanner;

public class CompruebaMail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu email: ");

		String email = sc.nextLine();

		compruebaemail(email);

	}

	public static boolean compruebaemail(String email) {

		int contador = 0;
		boolean esValido = false;
		// COMPROBAMOS QUE ACABA EN .COM O .ES

		if (email.substring(email.length() - 4).equals(".com") || email.substring(email.length() - 3).equals(".es"))
			esValido = true;

		else
			System.out.println("Tu email no acaba ni en .com ni en .es");

		// COMPROBAR LA LONGITUD DEL EMAIL ES MAYOR QUE 15

		if (email.length() > 15)

			esValido = true;
		else
			System.out.println("Tu correo no contiene 15 caracteres");

		char[] arrayem = email.toCharArray();

		for (int i = 0; i < email.length(); i++) {

			if (arrayem[i] == 'a')

				contador++;

		}
		
		if (contador ==1)
			esValido=true;
		
		else
			System.out.println("Tiene mas de un @ o ninguna");
		

		return esValido;

	}

}
