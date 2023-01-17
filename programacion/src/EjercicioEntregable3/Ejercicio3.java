package EjercicioEntregable3;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //ABRIMOS UN SCANNER
		
		System.out.println("Ejemplo instruccion 1:");//ENUNCIADO
		System.out.println("Palabra 1:");//ENUNCIADO 2
		String palabra1 = sc.nextLine(); //REGISTRAMOS RESPUESTA
		System.out.println("Palabra 2:");//ENUNCIADO3
		String palabra2 = sc.nextLine();//REGISTRAMOS RESPUESTA
		
		
		palabra1 = palabra1.toLowerCase(); //PONEMOS QUE LAS PASE A MINUSCULAS PARA QUE LA MAQUINA NO HAGA DISTINCIONES DEPENDIENDO DE MAYUS Y MINUS
		palabra2 = palabra2.toLowerCase();
		
		char [] char1 = palabra1.toCharArray(); //CONVERTIMOS DE STRING A CHAR
		char[] char2 = palabra2.toCharArray();
		
		
		
		
		if (char1 == char2) { //HACEMOS LA COMPARACION
			
			System.out.println("Las palabras son un anagrama");
		}
			else 
			{
				
				System.out.println("las palabras no son un anagrama");
			}
			
		}	
		
	
		
		
		
		
		
		}
									
				
	  }
			
			
	


 