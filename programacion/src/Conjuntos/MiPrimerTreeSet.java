package Conjuntos;

import java.util.TreeSet;

public class MiPrimerTreeSet {

	public static void main(String[] args) {
		
		
		//CREAMOS UN TREESET
		TreeSet<String>PrimerTree = new TreeSet<>();
		
		PrimerTree.add("Sastre");
		PrimerTree.add("pablo");
		PrimerTree.add("Luis");
		PrimerTree.add("Alejandro");
		PrimerTree.add("Sergio");
		
		System.out.println("Nombres del conjunto: " + PrimerTree);
		
		//ACCEDEMOS AL PRIMER ELEMENTO
		
		String primero = PrimerTree.first();
		System.out.println("Primer elemento : " + PrimerTree );
		
		String ultimo = PrimerTree.last();
		System.out.println("Ultimo elemento: " + ultimo);
		
		

	}

}
