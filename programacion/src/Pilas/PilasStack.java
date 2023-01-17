package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class PilasStack {

	public static void main(String[] args) {
		
		//CREAMOS UNA PILA DE TIPO STACK EN LA QUE GUARDAMOS STRINGS
		//METEMOS 5 STRINGS EN LA PILA
		//IMPRIMIMOS EL CONTENIDO PILA
		Scanner sc = new Scanner(System.in);
		
		Stack<String> pilas = new Stack<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca una palabra: ");
			pilas.push(sc.next());
		}
		
		/*while (!pilas.isEmpty()) {
			
			System.out.println(pilas.pop());
			
		}*/
		
		for (int i = 0; i < pilas.size(); i++) {
			System.out.println(pilas.get(i));
		}
		
		System.out.println(pilas);

	}

}
