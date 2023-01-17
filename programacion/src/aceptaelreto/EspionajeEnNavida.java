package aceptaelreto;

import java.security.PublicKey;
import java.util.Scanner;

import org.w3c.dom.html.HTMLFrameSetElement;

public class EspionajeEnNavida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la carta para los reyes magos: ");

		String palabra[] = null;

		String cartareyes = sc.nextLine();

		while (!cartareyes.equals("FIN"))

			cartareyes = sc.nextLine();

		for (int i = 0; i < palabra.length; i++) {

			ConviertePalabra(palabra[i], cartareyes, null);

		}

		{

			System.out.println("Fin del programa");

		}

	}

	private static void ConviertePalabra(String palabra, String cartareyes, Object object, ) {

		
		String res ="";
		
		for (int i = 0; i < palabra.le; i++) {
			
		}
 		
		
		
		
		
	}

	public static char Convierteletra(int letra) {

		int rango = 'Z' - 'A' + 1;
		int siguiente = (letra - 'A') + 1;

		if (letra == 'Z')
			siguiente = 0;

		char letrafinal = (char) (siguiente + 'A');

		return letrafinal;

	}

}
