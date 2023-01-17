/**
 * 
 */
package EjercicioEntregable2;

import java.util.Scanner;

public class ejercicio4 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el coste del prestamo: ");//PREGUNTAMOS CUAL ES LA CANTIDAD DEL PRECIO
		
		double cantidad = sc.nextDouble();  //CREAMOS UNA VARIABLE DOUBLE DONDE REGISTRAMOS LA CANTIDAD PEDIDA EN EL SYSO
		
		
		while (cantidad>0) //CREAMOS UN WHILE QUE ESPECIFICA UNA VEZ LA CANTIDAD SEA MENOR QUE 0 SE CIERRE
		{
			System.out.println("Aportacion: "); //CREAMOS SYSOAPORTACION
			double aportacion = sc.nextDouble();//REGISTRAMOS SU APORTACION CON LA VARIABLE DOUBLE
			cantidad = cantidad -aportacion; // REGISTRAMOS DICHA CANTIDAD MENOS SU APORTACION QUE QUEDA RESGISTRADA EN CANTIDAD
			System.out.println("Deuda Total:" + cantidad); //FINALMENTE SYSO MAS LA CANTIDAD REGISTRADA
			
		}
		
		
		System.out.println("Deuda pagada"); //SYSO FIN
		sc.close();

	}

}
