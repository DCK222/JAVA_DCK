/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cual es tu signo del zodiaco?");
		
		String horoscopo = entrada.nextLine();
		
		switch (horoscopo.toLowerCase()) {
		
		
		case "aries":
		    System.out.println("Has nacido entre el 21 de marzo y el 20 de abril ");
		break;
		case "tauro":
			System.out.println("Has nacido entre el 21 de abril y el 20 de mayo");
	    break;
	    
		case "geminis":
			System.out.println("Has nacido entre el 22 de mayo y el 21 de junio");
		break;
		case "Cancer":
			System.out.println("Has nacido entre el 22 de junio y el 22 de julio");
		break;
		case "Leo":
			System.out.println("Has nacido entre el 23 de julio y el 23 de agosto");
		case "Virgo":
			System.out.println("Has nacido entre el 23 de agosto y el 22 de septiembre");
		break;
		case "Libra":
			System.out.println("Has nacido entre el 23 de septiembre y el 22 de octubre");
		break;
		case "Escorpio":
			System.out.println("Has nacido entre el 23 de octubre y el 21 de noviembre");
		break;
		case "sagitario":
			System.out.println("Has nacido entre el 23 de noviembre y el 22 de diciembre");
		break;
		case "sagitario":
			System.out.println("Has nacido entre el 23 de diciembre y el 22 de enero");
		break;
		
		
			
		
		
		}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

		
		
		

	}

}
