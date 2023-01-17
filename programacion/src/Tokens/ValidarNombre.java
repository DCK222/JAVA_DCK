package Tokens;

import java.util.Scanner;

public class ValidarNombre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre correctamente:");
		
		String respuesta = sc.nextLine();
		
		
		System.out.println(ValidaNombre(respuesta));
		

	}
	
	public static boolean ValidaNombre(String respuesta) {
		return respuesta.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
		
		
		
		
	}

}
