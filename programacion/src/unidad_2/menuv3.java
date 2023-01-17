/**
 * 
 */
package unidad_2;

import java.util.Scanner;

public class menuv3 {


	public static void main(String[] args) {
		
		//declaramos variables

		String primero, bebida, postre;

		double cuenta = 0;



		//declarmos las constantes



		final double precioTortilla = 6.5;

		final double precioCerveza = 3;

		final double precioHelado = 4;

		final double precioLentejas = 10;

		final double precioAgua = 1;

		final double precioFlan = 3;



		//declaramos el scanner

		Scanner sc = new Scanner(System.in);



		//MOSTRAR EL MENÚ



		System.out.println(" ************ MENÚ *********");

		System.out.println("PRIMEROS:");

		System.out.printf("%-10s %-10.2f\n", "Tortilla", precioTortilla);

		System.out.printf("%-10s %-10.2f\n", "Lentejas", precioLentejas);

		System.out.println();

		System.out.println("BEBIDA:");

		System.out.printf("%-10s %-10.2f\n", "Cerveza", precioCerveza);

		System.out.printf("%-10s %-10.2f\n", "Agua", precioAgua);

		System.out.println();

		System.out.println("POSTRE:");

		System.out.printf("%-10s %-10.2f\n", "Flan", precioFlan);

		System.out.printf("%-10s %-10.2f\n", "Helado", precioHelado);





		// PRIMERO 

		System.out.println("Qué quieres de primero?");

		primero = sc.nextLine();



		if(primero.equalsIgnoreCase("Tortilla"))

		cuenta += precioTortilla;



		else if (primero.equalsIgnoreCase("Lentejas"))

		cuenta += precioLentejas;



		else

		System.out.println("Primero no válido");



		// BEBIDAS



		System.out.println("Qué quieres de bebida?");

		bebida = sc.nextLine();



		if(bebida.equalsIgnoreCase("Agua"))

		cuenta += precioAgua;



		else if (bebida.equalsIgnoreCase("Cerveza"))

		cuenta += precioCerveza;



		else

		System.out.println("Bebida no válida");





		// POSTRE



		System.out.println("Qué quieres de postre?");

		postre = sc.nextLine();



		if(postre.equalsIgnoreCase("Flan"))

		cuenta += precioFlan;



		else if (postre.equalsIgnoreCase("Helado"))

		cuenta += precioHelado;



		else

		System.out.println("Postre no válido");



		//COMPROBAMOS SI TIENE SUFICIENTE DINERO

		System.out.println("¿Cuánto dinero llevas");

		double dinero = sc.nextDouble();



		if(dinero<cuenta)

		System.out.println("No llevas pasta. Fuera");

		else

		{

		if(cuenta>=15)

		cuenta = cuenta*0.97;

		System.out.println("Tienes que pagar: " + cuenta + " euros");

		}

	}	
	}
