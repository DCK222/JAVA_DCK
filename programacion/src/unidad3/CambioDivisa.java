/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class CambioDivisa {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros a convertir");
		double euros = sc.nextDouble();
		
		System.out.println("A que moneda quieres convertir(Dolares,libras o yenes)?");
		String moneda = sc.next();
		
		//INVOCAMOS PROCEDIMIENTO
		cambiodivisa(euros,moneda);
		sc.close();
	}
	public static void cambiodivisa(double cantidad, String moneda)
	{
		
		final double alibras = 0.86;
		final double aDolares = 1.28511;
		final double aYenes = 129852;
		
		double resultado = 0;
		
		switch(moneda.toLowerCase())
		{
		case "libras":
			resultado = cantidad * alibras;
		case "dolares":
			resultado = cantidad * aDolares;
		case "yenes":
			resultado = cantidad * aYenes;
		break;
		
		default: System.out.println("Moneda Incorrecta");
			
		}
		
		System.out.println(cantidad + " euros en " + moneda + " son " + resultado);
		
	}
	
}
