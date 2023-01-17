package listas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MiPrimeraLista {

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Lunes", "Martes", "Miercoles","Jueves","Viernes","Sabado","Domingo");
		
		System.out.println("El primer elemento de la lista es : " + lista.get(0));
		
		System.out.println("El tamaño de la lista es:" + lista.size());
		System.out.println("La lista es: " + lista);
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i)+ " ");
			
		}
		
		System.out.println();
		
		for (String dia : lista) {
			System.out.print(dia + " ");
		}
		
		Iterator <String> it = lista.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next()+ " ");
			
		}
		
		//DESDE EL FINAL HASTA EL PRINCIPIO
		ListIterator<String> li = lista.listIterator(lista.size());
		
		while (li.hasPrevious()) {
			
			System.out.println(li.previous()+ " ");
			
		}
		
		System.out.println();
		//BUSQUEDA DE ELEMENTOS
		System.out.println("El elemento 'Jueves' se encuentra en : " + lista.indexOf("Jueves"));
		System.out.println();
		
		//CREAMOS UNA LISTA DE ENTEROS
		List<Integer> numeros = Arrays.asList(22,45,2,8,17,98,46,23);
		System.out.println(numeros.indexOf(45));
		System.out.println("Ultima posicion: " + numeros.lastIndexOf(45));
		System.out.println("Esta el elemento??: "+ numeros.contains(11));
		
		int contador =0;
		
		for (Integer integer : numeros) {
		if (condition) {
			
		}	
		}
			
		}
		
		
		
		
		

	 
	
	}

}
