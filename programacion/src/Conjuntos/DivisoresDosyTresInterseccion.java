package Conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DivisoresDosyTresInterseccion {

	public static void main(String[] args) {

		// *** USAR FUNCIONES

		// CREAR DOS HASHSET DE NUMEROS ALEATORIOS. EL NÚMERO

		// DE COMPONENTES DE CADA HASHSET TB SERÁ ALEATORIO ENTRE 30 Y 1000

		HashSet<Integer> conjuntoA = getConjuntoNumeros();

		HashSet<Integer> conjuntoB = getConjuntoNumeros();

		// ORDENAR LOS ELEMENTOS DEL CONJUNTO Y MOSTRARLOS

		// convertir a lista los sets

		System.out.print("CONJUNTO A: " + conjuntoA);
		ordenar(conjuntoA);

		System.out.print("CONJUNTO B: " + conjuntoB);
		ordenar(conjuntoB);

		// HALLAR LA INTERSECCIÓN DE AMBOS CONJUNTOS Y MOSTRARLA

		// HALLAR LOS DIVISORES DE 2 Y 3 DE LA INTERSECCION

		getDivisoresTresyDos(conjuntoA, conjuntoB);

	}

	public static void getDivisoresTresyDos(HashSet<Integer> a, HashSet<Integer> b) {

		a.retainAll(b);

		List<Integer> lista = new ArrayList<Integer>(a);

		Collections.sort(lista);

		System.out.println("Intersección: " + lista);

		// hallamos los divisores de la interseccion

		Iterator<Integer> it = a.iterator();

		System.out.print("Divisores de 2 y 3: ");

		while (it.hasNext()) {

			int n = it.next();

			if (n % 2 == 0 && n % 3 == 0)

				System.out.print(n + " ");

		}

	}

	public static void ordenar(HashSet<Integer> h) {

		List<Integer> lista = new ArrayList<Integer>(h);

		Collections.sort(lista);

		System.out.println(lista);

	}

	public static HashSet<Integer> getConjuntoNumeros() {

		HashSet<Integer> numeros = new HashSet<>();

		int max = (int) (Math.random() * 100) + 30;

		for (int i = 0; i <= max; i++) {

			numeros.add((int) (Math.random() * 100) + 1);

		}

		return numeros;

	}
}
