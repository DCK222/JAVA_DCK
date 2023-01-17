/**
 * 
 */
package EjercicioEntregable2;

import java.util.Scanner;

public class ejercicio1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //ABRIMOS EL SCANNER
		
		System.out.println("¿A que hora estamos?");// PREGUNTAMOS AL USUARIO LA HORA
		int hora = sc.nextInt();// REGISTRAMOS RESPUESTA, VARIABLE INT
		
		/*
		 * PONEMOS EN EL IF LAS FRANJAS HORARIAS Y DEPENDIENDO DE LA HORA
		 * TE RESPONDERA CON BUENOS DIAS, BUENAS TARDES Y BUENAS NOCHES
		 */
		
		
		if (hora >=6 && hora<12) {
			
			System.out.println("Buenos dias");
			}
		else if (hora>=13 && hora<20){
			
			System.out.println("Buenas Tardes");
		}
		
		else if ((hora>=20 && hora<23) || (hora>=0 && hora<5))   {
			
			System.out.println("Buenas noches");
		}
		else 
			System.out.println("Tu numero estas fuera de los rangos horarios crack");
		
		sc.close(); //CERRAMOS SCANNER.
		
			
		
		
		
		
		
		

	}

}
