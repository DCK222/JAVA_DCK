/**
 * 
 */
package EjercicioEntregable2;

import java.util.Scanner;

public class ejercicio3 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//ABRIMOS SCANNER
		 
		 int mayor = Integer.MIN_VALUE; //VARIABLE INT QUE REGISTRAR EL NUMERO MAYOR
		 
		 for(int i=0;i<=4;i++)//USAMOS FOR Y PONEMOS RANGOS DESDE 0 A 4 Y NO A CINCO POR QUE EMPEZAMOS DESDE 0
		 {
			 System.out.println("Introduce un numero");//PEDIMOS NUMERO
			 int num = sc.nextInt();//LO REGISTRAMOS EN VARIBALE INT
			 
			 if(num>mayor) //CUANDO EL NUEMERO SEA MAYOR
			 
			 mayor=num; //MAYOR NUM
			 
			 
		 }
		 
		 System.out.println("El numero mayor es " + mayor);//FINALMENTE REGISTRAMOS
		 
		 sc.close();
		

	}

}
