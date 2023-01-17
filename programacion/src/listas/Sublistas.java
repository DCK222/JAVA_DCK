package listas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sublistas {

	public class MiPrimeraLista {



		public static void main(String[] args) {



		List<String> lista = Arrays.asList("lunes", "martes", "miercoles", 

		"jueves", "viernes", "sabado", "domingo");



		System.out.println("El primer elemento de la lista es " + lista.get(0));

		System.out.println("El tamaño de la lista es " + lista.size());

		System.out.println("La lista es: " + lista);



		//RECORREMOS LA LISTA CON UN FOR

		for (int i = 0; i < lista.size(); i++) {

		System.out.print(lista.get(i)+ " ");

		}



		System.out.println();

		//RECORREMOS LA LISTAS CON UN FOREACH (FOR MEJORADO)



		for(String dia:lista) {

		System.out.print(dia + " ");

		}



		System.out.println();

		//RECORREMOS LA LISTA CON UN ITERADOR

		Iterator <String> it = lista.iterator();



		while(it.hasNext()) {

		System.out.print(it.next() + " ");

		}



		System.out.println();

		//RECORREMOS LA LISTA DESDE EL FINAL HASTA EL PRINCIPIO (ITERADOR EXTENDIDO)

		ListIterator<String> li = lista.listIterator(lista.size());



		while(li.hasPrevious()) {

		System.out.print(li.previous() + " ");

		}



		System.out.println();

		//BUSQUEDA DE ELEMENTOS

		System.out.println("El elemento 'JUEVES' se encuentra en: " + lista.indexOf("hola"));

		System.out.println();



		//CREAMOS UNA LISTA DE ENTEROS

		List<Integer> numeros = Arrays.asList(22,45,2,8,45,98,45,23);

		System.out.println("PRIMERA POSICION: " + numeros.indexOf(45));

		System.out.println("ÚLTIMA POSICION: " + numeros.lastIndexOf(45));

		System.out.println("ESTÁ EL ELEMENTO?? " + numeros.contains(11));



		//DECIR CUANTAS VECES APARECE UN ELEMENTOS CON EL FOR MEJORADO

		int cont=0;



		for (Integer numero : numeros) {

		if(numero.equals(45))

		cont++;

		}

		System.out.println("El elemento se repite: " + cont + " veces");



		System.out.println();

		//DECIR CUANTAS VECES APARECE UN ELEMENTO CON ITERADOR

		int cont2 = 0;

		Iterator <Integer> itNum = numeros.iterator();

		while(itNum.hasNext()) {

		if(itNum.next().equals(45))

		cont2++;

		}

		System.out.println("El elemento se repite: " + cont2 + " veces");

		}



		}
