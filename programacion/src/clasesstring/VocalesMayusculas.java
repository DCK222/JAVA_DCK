package clasesstring;

import java.util.Scanner;

public class VocalesMayusculas {

	public static void main(String[] args) {
		
		//PEDIMOS AL USUARIO UNA FRASE POR CONSOLA
		//FUNCION: CAMBIAMOS LAS VOCALES POR MATUSCULAS
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase:");
		
		 String respuesta = sc.nextLine();
		 
		 
		 StringBuilder miPrimerSB = new StringBuilder(respuesta);
		
		 System.out.println(Cambiovocal(miPrimerSB));
		 
		 
		 
	} 
		 
		 
		 
		 
		 public static StringBuilder Cambiovocal(StringBuilder respuesta) {
			 
			 for(int i = 0; i<respuesta.length();i++) {
				 
				 char letra = respuesta.charAt(i);
				 
				 if ("aeiou".contains(String.valueOf(letra))) {
					 
					respuesta.setCharAt(i, Character.toUpperCase(letra));
				 
				 
				 }
				 
		 
			 }
			return respuesta;
		 
		 
			 
		 } 
		 
		 
public static StringBuilder BorraEspacios(StringBuilder respuesta) {
			 
			 for(int i = 0; i<respuesta.length();i++) {
				 
				 char letra = respuesta.charAt(i);
				 
				 if (letra == ' ') {
					 
					 .deleteCharAt(i);
				 
				 
				 }
				 
		 
			 }
			return respuesta;
		 
		 
			 
		 } 
			 
		 
		 
		 

	}

