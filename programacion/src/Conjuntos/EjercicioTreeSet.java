package Conjuntos;

import java.util.Iterator;
import java.util.TreeSet;



public class EjercicioTreeSet {

	public static void main(String[] args) {

		// CREAMOS UN TREESET DE ENTEROS
		// ELIMINAMOS TODOS LOS ELEMENTOS DEL TREESET
		// SI EL ARBOL ESTA VACIO QUE NOS DIGA TRUE/FALSE
		// AÑADIMOS UN 100, 10, 50, 1, 13
		// IMPRIMIMOS EL ARBOL
		// COMPROBAMOS SI CONTIENE EL ELEMENTO 50 (TRUE/FALSE)
		// NOS SITUAMOS EN EL ELEMENTO 50 E IMPRIMIMOS LOS ELEMENTOS QUE TIENE DEBAJO
		// "" QUE TIENE DEBAJO INCLUIDO EL 50
		// MOSTRAMOS TODOS LOS ELEMENTOS DEL ARBOL CON UN ITERATOR

		TreeSet<Integer> numeros = new TreeSet<>();

		numeros.clear();

		if (numeros.isEmpty()) {

		}
		System.out.println("¿Esta vacio? : " + numeros.isEmpty());

		numeros.add(100);
		numeros.add(10);
		numeros.add(50);
		numeros.add(1);
		numeros.add(13);

		System.out.println("Numeros arbol: " + numeros);

		numeros.contains(50);
		System.out.println("¿ Contiene el numero 50 ? : " + numeros.contains(50));

		numeros.tailSet(50);

		System.out.println("Numeros por encima de 50: " + numeros.tailSet(50));

		numeros.headSet(50);

		System.out.println("Elemento por debajo de 50 : " + numeros.headSet(50));
		
		
		Iterator<Integer> numerosv = numeros.iterator();
		
		while (numerosv.hasNext()) {
			System.out.println("Imprimir con iterator : " + numerosv.next());
			
		}
		
		

	}

}
