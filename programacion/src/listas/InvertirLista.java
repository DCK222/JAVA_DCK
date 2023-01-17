package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class InvertirLista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		List<String> nombres = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("introduce nombres");

			nombres.add(sc.next());
		}
		
		System.out.println(nombres);
		
		public static ArrayList<String> invertir(ArrayList<String> nombres){
			
			ArrayList<String> resultado = new ArrayList<>();
			
			for (int i = 0; i < nombres.size(); i++) {
				
				resultado.add(nombres.get(i));
				
			}
			
			return resultado;
		}
	 	
		
		
		
		
		
		
		
		
		
			
		}

	}

	

	


