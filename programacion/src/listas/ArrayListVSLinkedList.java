package listas;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {

		ArrayList<String> Listaprim = new ArrayList<>();

		LinkedList<String> Listaseg = new LinkedList<>();

		long tiempo;

		for (int i = 0; i < 10000; i++) {

			Listaprim.add("Palabra " + i);

			Listaseg.add("Palabra " + i);

		}

		System.out.println("TIEMPO INVERTIDO EN INSERTAR UN SRING EN CADA LISTA");

		tiempo = System.nanoTime();

		Listaprim.add("palabra nueva");

		System.out.println("arraylist: " + (System.nanoTime() - tiempo));
		
		tiempo = System.nanoTime();
		

		Listaseg.add("palabra nueva");

		System.out.println("Linkedlist: " + (System.nanoTime() - tiempo));

	}

}
