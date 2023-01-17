/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class NotaMedia {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce las ultimas 3 notas que has sacado en los examenes");
		
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		double nota3 = entrada.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		if(media<5)
			System.out.println("Te has ido pal pozo ma G");
		else if(media<6)
			System.out.println("Suficiente loco");
		else if (media<7)
			System.out.println("Bien");
		else if(media<9)
			System.out.println("notable");
		else if(media<10)
			System.out.println("Sobresaliente");
		else 
			System.out.println("Matricula");
		
		

	}

}
