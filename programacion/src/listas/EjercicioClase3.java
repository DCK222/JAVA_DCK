package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EjercicioClase3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero inicial: ");

		int numeroinicial = sc.nextInt();

		System.out.println("introduce el numero final: ");

		int numerofinal = sc.nextInt();
		
		List<Integer> Listanumeros = new ArrayList<>();
		
		for (int i = numeroinicial; i <= numerofinal; i++) {
			
			
			Listanumeros.add(numeroinicial);
			numeroinicial++;
		
		}
		
		System.out.println("Lista numeros: "+Listanumeros);
		
		

		System.out.println("Multiplos a localizar: ");

		int multiplos = sc.nextInt();
		
		int contador = 0;
		
		for (int i = 0; i <Listanumeros.size() ; i++) {
			
			if (Listanumeros.get(i)% multiplos == 0) {
				
				contador++;
				
			} else {
				
				Listanumeros.set(Listanumeros.indexOf(Listanumeros.get(i)), 0);

			}
			
		}
		
		System.out.println("Los multiplos son: " + Listanumeros);

		}
		
		

	}


