package EjercicioEvaluable6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArcaDeNoeV2 {

	public static void main(String[] args) {
		
		
		//CREAMOS LISTA DE ARRAYS Y UN SCANNER
		ArrayList<String> ListaAnimales = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);

	    // PEDIMOS AL USUARIO LOS ANIMALES
	    while (true) {
	      System.out.print("Ingrese los animales: ");
	      String palabras = scanner.nextLine();
	      
	      ListaAnimales.add(palabras);
	    }
	    
	    

	    //RECORREMOS EL ARRAYLIST Y CONTAMOS LAS PALABRAS QUE ACABEN EN "O""A" Y LAS PALABRAS QUE TENGAN LAS MISMAS LETRAS SUMA UNO AL CONTADOR

	    int contador = 0;
	    for (int i = 0; i < ListaAnimales.size(); i++) {
	      for (int j = i + 1; j < ListaAnimales.size(); j++) {
	        String animal1 = ListaAnimales.get(i);
	        String animal2 = ListaAnimales.get(j);
	        if (animal1.equals(animal2) && animal1.endsWith("o") && animal2.endsWith("a")) {
	          contador++;
	        }
	      }
	    }

	    //IMPRIMIMOS 
	    System.out.println(contador);
		
		
		
	  }
	
	

	}


