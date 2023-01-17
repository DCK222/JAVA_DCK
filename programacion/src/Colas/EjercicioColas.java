package Colas;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EjercicioColas {

	public static void main(String[] args) {
		
		//LinkedList
		//ArrayDEQUE
		//PRIORITYQUEUE
		
		LinkedList<Integer>ListaLink = new LinkedList<>();
		
		ListaLink.offer(300);
		ListaLink.offer(200);
		ListaLink.offer(100);
		
		ArrayDeque<Integer>ListaDeque = new ArrayDeque<>();
		
		ListaDeque.offer(300);
		ListaDeque.offer(200);
		ListaDeque.offer(100);
		
		PriorityQueue<Integer>Listapriority = new PriorityQueue<>();
		
		Listapriority.offer(300);
		Listapriority.offer(200);
		Listapriority.offer(100);
		
		
		
		//AÑADIMOS DOS ELEMENTOS AL PRINCIO DE CADA COLA 
		
		//IMPRIMIMOS COLAS
		imprimircolas(ListaLink, ListaDeque, Listapriority);
		
		//DEVOLVEMOS EL PRIMER ELEMENTO DE CADA COLA
		
		System.out.println("PRIMER ELEMENTO DE LINKED :"+ListaLink.peek());
		
		System.out.println();
		
		System.out.println("Ultimo elemento : "+ListaLink.peekLast());
		System.out.println("Ultimo elemento : "+ListaDeque.peekLast());
		// NO EXSITE System.out.println("Primer elemento : "+Listapriority.peekLast());
		
		//SACAMOS EL ULTIMO ELEMENTO DE TODAS LAS COLAS.
		System.out.println();
		System.out.println("Sacamos elemento : "+ListaLink.pollLast());
		System.out.println("Sacamos elemento : "+ListaDeque.pollLast());
		
		//AÑADIMOS ELEMENTO NULO AL FINAL(NULL)
		
		System.out.println();
		System.out.println("ELEMENTO NULL : "+ListaLink.offerLast(null));
		
		//EN EL PRIORITY NO SE PUEDE
		//NI EN DEQUE
		
		//IMPRIMOS LOS ELEMENTOS CADA UNO
		
		
		
		while (!ListaLink.isEmpty()) {
			
			System.out.print("\nDE UNO A UNO : " + ListaLink.poll() + " ");
			
		}
		
		
		
		
		
		
	}
	
	public static void imprimircolas(Queue<Integer> ListaLink , Queue<Integer> ListaDeque , Queue<Integer> Listapriority) {
		
		System.out.println();
		
		System.out.println("LINKEDLIST " + ListaLink);
		System.out.println("ARRAY DEQUE " + ListaDeque);
		System.out.println("PRIORITY QUEUE " + Listapriority);
		
		//SACAMOS PRIMER ELEMENTO DE CADA COLA.
		
		System.out.println();
		
		System.out.println("Primer elemento : "+ListaLink.poll());
		System.out.println("Primer elemento : "+ListaDeque.poll());
		System.out.println("Primer elemento : "+Listapriority.poll());
		
		
		
	}

}
