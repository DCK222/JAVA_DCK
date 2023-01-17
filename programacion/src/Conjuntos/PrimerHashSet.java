package Conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PrimerHashSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> conjuntoA = new HashSet<>();
		HashSet<String> conjuntoB = new HashSet<>();

		// PEDIMOS LOS NOMBRES AL USUARIO.
		//CONJUNTO A

		System.out.println("Escribe varios nombres separados por espacios: ");

		String respuesta = sc.nextLine();

		String[] arraynombres = respuesta.split(" ");
		List<String> listanombres = Arrays.asList(arraynombres);
		conjuntoA.addAll(listanombres);
		System.out.println(conjuntoA);
		
		//CONJUNTO B
		
		System.out.println("Escribe varios nombres separados por espacios: ");

		String respuesta2 = sc.nextLine();

		String[] arraynombres2 = respuesta.split(" ");
		
		List<String> listanombres2 = Arrays.asList(arraynombres);
		conjuntoA.addAll(listanombres2);
		System.out.println(conjuntoB);
		
		

	}

}
