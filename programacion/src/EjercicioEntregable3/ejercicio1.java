/**
 * 
 */
package EjercicioEntregable3;

import java.util.Scanner;

public class ejercicio1 {


	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in); //INICIALIZAMOS SCANNER
			
			
			int array [] = new int [5]; // ABRIMOS UN ARRAY CON 5 VALORES
			
			int ini = 0; //DECLARAMOS VARIABLE INT DESDE 0
			
			int menor = Integer.MAX_VALUE;
			int mayor = Integer.MIN_VALUE;  //INICIALIZAMOS ARIABLES PARA QUE SAQUE LOS MAYORES Y OS MENORES
			
			
			System.out.println("Introduce las notas de 5 alumnos"); //PEDIMOS AL USUARIO QUE NOS INTRODUZACA LO NOTA DE 5 ALUMNOS
	            
			for (ini = 0; ini < array.length;)  //INICIALIZAMOS UN FOR MEDIANTE UN LENGTH
			{

				System.out.println("Introduce la nota del alumno " + (ini + 1)); //EN ESTE SISO HACEMOS CUANDO NOS PIDA LA NOTA CAMBIE EL NUMERO
				
				int notas = sc.nextInt(); //QUEDAN REGISTRADAS LAS NOTAS EN EL SCANNER
				
				if (notas < 0 || notas > 10) // HACEMOS ESTE IF PARA QUE EN CASO DE QUE LA NOTA SEA MENOR QUE 0 Y MAYOR QUE 10 CIERRE Y DIGA QUE NO ES VALIDA
				{
					System.out.println("Nota no válida"); 
				}
				
				
				if (notas > 0 || notas < 10) // EL NUMERO ENTRA EN LOS PARAMETRO 0-10
				{
					array [ini] = notas; 
					
					ini++;
				}
			
			}
			
				for (int i = 0; i < array.length; i++)  //INICIAMOS UN FOR CON NOMBRE i()
				{
					
					if (mayor < array [i])  //QUE SE DETERMINE EL MAYOR DEL ARRAY
					{
						mayor = array [i];
					}
				}
				
				for (int j = 0; j < array.length; j++) 
				{
						
					if (menor > array [j]) //QUE SE DETERMINE EL MENOR DEL ARRAY
					{
							
						menor = array [j];
							
					}
					
				}
				
			System.out.println("La Diferencia de notas es: " + (mayor - menor)); //FINALMEN HACEMOS UN SYSO EN EL CUAL RESTE EL MENOR - EL MAYOR
			
			sc.close(); //CERRAMOS SCANNER
			
		}

	
		
		
		

	}


