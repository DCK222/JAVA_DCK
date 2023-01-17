package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiPrimerArrayList {

	public static void main(String[] args) {
		
		List<String> diasemana = Arrays.asList("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
		
		ArrayList<String> primerArrayList = new ArrayList <>(diasemana);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//3.AÑADIR ELEMENTOS DE UN ARRAYLIST
		numeros.add(2);
		
		// 4. AÑADIR UNA LISTA DE ELEMENTOS 
		numeros.addAll(Arrays.asList(7,88,86,88));

		
		//5.INTRODUCIMOS UN NUMERO ENTRE EL 88 Y EL 85
		
		int posicion = numeros.indexOf(88);
		numeros.add(posicion + 1 , 500);
		
		System.out.println(numeros);
		
		//6.SUSTITUIR UN ELEMENTOPOR OTRO
		numeros.set(numeros.indexOf(500), 1000);
		System.out.println(numeros);
		
		
		
		
	}

}
