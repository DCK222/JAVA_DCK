package Conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		//PEDIMOS AL USUARIO UN NUMERO ENTRE EL 1 Y 10
		//CREAMOS UN ARRAY DE NUMEROS CON ESE TAMAÑO
		//RELLENAMOS EL ARRAY CON NUMEROS ALEATORIOS DEL 0 AL 10
		//IMPRIMIMOS EL ARRAY
		//MOSTRAMOS LOS NUMEROS QUE NO ESTAN REPETIDOS
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero comprendido del 1-10");
		
		int respuesta = sc.nextInt();
		
		Integer [] numero = new Integer[respuesta];
		
		List<Integer> Listanumeros = Arrays.asList(numero);
		
		for (int i = 0; i < Listanumeros.size(); i++) {
			Listanumeros.add(((int)(Math.random()*10)));
			numero[i]=aleatorio;
		}
		
		System.out.println(Arrays.toString(numero));

	}

}
