package Colas;

import java.util.ArrayDeque;

public class ColasDobles {

	public static void main(String[] args) {

		int[] listadoinicial = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		ArrayDeque<Integer> listadoFinal = new ArrayDeque<>();

		for (Integer elemento : listadoinicial) {

			if (elemento % 2 == 0) {

				listadoFinal.addLast(elemento);

			}

			else {
				listadoFinal.addFirst(elemento);
			}

		}
		System.out.println("La lista final es :" + listadoFinal);

	}

}
