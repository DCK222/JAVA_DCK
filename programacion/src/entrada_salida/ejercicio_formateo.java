/**
 * 
 */
package entrada_salida;


public class ejercicio_formateo {

	
	public static void main(String[] args) {
		
		/* DECLARO DOS VARIABLES X=144 , Y=999
		 * HACEMOS LA SUMA RESTA MULTIPLICACION Y DIVISION
		 * 
		 * VARIABLES SUMA RESTA DIV MULT
		 * -----------------------------------
		 * 144 Y 199 343  -55   0,72 28656
		 */
		
		
	double X = 144;
	double Y = 999;
	
	double suma = X + Y;
	double resta = Y - X;
	double multiplicacion = X * Y;
	double Division = X / Y;
	 
	
		
	System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "VARIABLES", "SUMA", "RESTA", "DIV", "MULT");
	System.out.println("----------------------------------------------------------------------------------------");
	
	
	System.out.println("% 0.f y %...........");
	}

}
