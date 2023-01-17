package listas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListStringsv1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<String> Lista = new LinkedList<>();

		for (int i = 1; i < 6; i++) {

			System.out.println("Introduce la palabra numero " + i);

			String palabra = sc.nextLine();
			
			Lista.add(palabra);

		}
		System.out.println("La lista principal es: " + Lista);
		
		System.out.println("Ahora introduce la una letra: ");
		
		char letra = sc.next().charAt(0);
		
		Iterator<String> recorre = Lista.listIterator();
		
		recorre.next();
		
		
		
		
		
			
		}
		

	}


