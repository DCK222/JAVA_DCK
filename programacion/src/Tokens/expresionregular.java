package Tokens;

import java.util.Scanner;

public class expresionregular {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu dni: ");
		
		String dni = sc.nextLine();
		
		validarDNI(dni);
		System.out.println(validarDNI(dni));
		
		System.out.println("Introduce tu nombre correctamente:");
		
		
	}

	
	
	public static boolean validarDNI(String dni) {
		return dni.matches("^[0-9]{8}[A-Z]$");
		
		
		
	}
  //Primera letra mayusculas y resto mayusculas
  //puede haber nombre compuestos es decir un solo espacio
	
	public static boolean ValidarNombre() {
		
		
		
	}
	

 
		
	}
}

