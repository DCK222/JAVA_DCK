/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class tablafor {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero");
	    numero = entrada.nextInt();
	    
	    System.out.println("Tabla del " + numero);
	    
	    for( int i = 1; i<=10; i++ ) {
	    	
	    	System.out.println(numero + " * " + i + " = " + numero*i);
	    	
	    }
	    
	    entrada.close();
		
		
		
		
		

	}

}
