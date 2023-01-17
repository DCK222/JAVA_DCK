package listas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RetoClase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce varios nombres por consola: ");
		
		String nombre = sc.nextLine();
		
		String [] espacios = nombre.split(" ");
		
		List<String> lista = Arrays.asList(espacios);
		
		System.out.println("Introduce nombre a buscar");
		
		String nombre2 = sc.nextLine();
		
		if (lista.contains(nombre2)) {
			
			System.out.println("El nombre" + nombre + " " + lista.indexOf(nombre));
			
			
		} else {
			
			System.out.println("El nombre no esta en la lista de nombres");

		}
		
		
		
		
		
		
		
		

	}

}
