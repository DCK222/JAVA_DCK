package Pilas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Segundapila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//CREAMOS UNA PILA DE TIPO ARRAYDEQUE
		//AGREGAR 5 ELEMENTOS
		//SACAR EL PRIMER ELEMENTO
		//ELIMINAR EL PRIMER ELEMENTO
		//ELIMINAR EL PRIMAR ELEMENTO
		//SACAR EL PRIMER ELEMENTO
		
		ArrayDeque<String> meregalo = new ArrayDeque<>();
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println("Introduce un string, si no sabes lo que es un string te jodes: ");
			meregalo.add(sc.next());
		}
		
		System.out.println(meregalo.pollFirst());
		System.out.println(meregalo.pollFirst());
	}

}
