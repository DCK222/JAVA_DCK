package clasesstring;

import java.util.Iterator;
import java.util.Scanner;

public class EstudiandoStrings {

	// PROGRAMA DADO UN STRING QUE IMPRIMA EL NUMERO DE LETRAS
	// DIGITOS Y ESPACIOS EN BLANCO DE LA CADENA

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase:");

		String frase = sc.nextLine();
		
		conteo(frase);

	}

	public static StringBuilder conteo(String frase) {
		
		int numDigitos=0;
		int numLetras=0;
		int numEspacios=0;
		
		for(int i=0;i<frase.length();i++) {
			
			char letra = frase.charAt(i);
			
			if (Character.isDigit(letra))
				numDigitos++;
			
			
		
			
			
			
		}

		
		
			
			
			
			

		}
		return letra;

	}

}
