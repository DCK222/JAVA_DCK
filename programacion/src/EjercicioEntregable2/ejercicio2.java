/**
 * 
 */
package EjercicioEntregable2;

import java.util.Scanner;

public class ejercicio2 {
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);//ABRIMOS SCANNER
		
		
		System.out.println("Introduce un numero entre el 1-1.000.000");// PEDIMOS UN NUMERO COMPRENDIDO
		
		int numeroreal = sc.nextInt();//REGISTRAMOS EL NUMERO CON VARIABLE INT
		int contador = 0;//CREAMOS CONTADOR Y QUE EMPIECE A CONTAR DESDE 0
		
		
		
		while (numeroreal>=1 && numeroreal<=1000000 ) //EN EL WHILE LE PEDIMOS QUE FUNCIONE SIEMPRE QUE ESTE COMPRENDIDO ENTRE EL RANGO
		{
			
			
			if ( numeroreal%10 == 5) //CALCULAMOS EL RESTO DE LA DIVISION
			{
				contador++; //CUANDO EL RESTO SEA 5 QUE SUME EL CONTADOR
				numeroreal=numeroreal/10; //DIVIDIMOS EL NUMERO REAL 
			}
				else  
				{		
					numeroreal=numeroreal/10;
					
				}
				
		}
			
			System.out.println("Tu numero tiene " + contador++ + " cincos");//FINALMENTE REGISTRAMOS EL RESULTADO DEL CONTADOR
				
			
			
		
			/
		
			
		
		

	}

}
