/**
 * 
 */
package entrada_salida;

import java.util.Scanner;

public class areas_triangulos {

	
	public static void main(String[] args) {
		
		/*PIDE POR CONSOLA AL USUARIO LA ALTURA Y LA BASE DE UNA TRIANGULO (CON DECUMALES)
		 * Y HALLA SU AREA. A = (B*A)/2
		 */

		double altura, base, area;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introduce la Base del triangulo");
		base = entrada.nextDouble();
		
		System.out.println("ahora introduce su altura en cm");
		altura = entrada.nextDouble();
		area = (base * altura) / 2;
		
		System.out.printf("El area del triangulo con base %.3f y altura %.3f es %.3f cm^2  \n", base , altura, area);
		
		
		
		
		

  
	}

}
