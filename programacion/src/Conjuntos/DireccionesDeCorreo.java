package Conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DireccionesDeCorreo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String correosini = "alegard22@gmail.com;ivan08@gmail.com;originalalex@gmail.com;drillpablo04@hotmail.com ;XxYoryixX@yahoo.com";

		String[] correos2 = correosini.split(";");

		HashSet<String> ListaCorreos = new HashSet<String>();

		ListaCorreos = separarDominios(correos2);

		mostrardominios(ListaCorreos);

	}

	public static HashSet<String> separarDominios(String[] c) {

		String[] emailparts;
		HashSet<String> dominios = new HashSet<String>();
		for (int i = 0; i < c.length; i++) {
			emailparts = c[i].split("@");

			if (emailparts.length == 2) {
				dominios.add(emailparts[1]);
			}

		}
		return dominios;

	}

	public static HashSet<String> mostrardominios(HashSet<String> dominios) {

		Iterator<String> it = dominios.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		return dominios;

	}

}
