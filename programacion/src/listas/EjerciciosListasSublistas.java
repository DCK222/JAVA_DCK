package listas;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListasSublistas {

	public static void main(String[] args) {

		// CREAMOS ARRAYLIST DE ENTEROS
		// LO RELLENAMOS CON UN 10 DE ENTEROS ALEATORIOS ENTRE EL 0 Y 100
		// IMPRIMIMOS LA LISTA
		// OBTENEMOS UN SUBLISTA DESDE EL ELEMENTO 3 HASTA EL 6 (AMBOS INCLUIDOS)
		// IMPRIMIMOS A LA SUBLISTA
		// QUITAMOS LA SUBLISTA DE LA LISTA
		// IMPRIMIMOS NUEVAMENTE LA LISTA

		ArrayList<Integer> listaenteros = new ArrayList<>();

		Integer numaleatorio;

		for (int i = 0; i < 10; i++) {

			listaenteros.add((int) (Math.random() * 100));

		}
		System.out.println(listaenteros);
		
		
		List<Integer> SublistaSemana = listaenteros.subList(3,7);
		
		System.out.println(SublistaSemana);
		
		//QUITAMOS LA SUBLISTA DE LA LISTA
		
		listaenteros.removeAll(SublistaSemana);
		
		System.out.println("Lista original" + listaenteros);
	}

}
