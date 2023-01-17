/**
 * 
 */
package unidad3;


public class ejercicio4 {


	public static void main(String[] args) {
		
		//Numero pares Impares
		/*
		 * Creamos un array con 150 elementos y lo rellenamos con numeros aleatorios
		 * comprendidos entre el 0 y el 100
		 * Contamos cuantos numeros pares e impares hay
		 * Lo guardamos en dos arrays diferentes
		 * y los mostramos por pantalla
		 */
		
		int numeros [] = new int [150];
		int contadorpares = 0;
		int contadorimpa = 0;
		
		for(int i = 0;i<numeros.length;i++)
		{
			int aleatorio = (int)(Math.random()*100);
			numeros [i]= aleatorio;
			
			System.out.println(aleatorio);
			
			if (numeros[i]%2==0)
			{
				contadorpares++;
				System.out.println();
			}
			else
			{
				contadorimpa++;
			}
			
		}
		
		
		{
			
		}

		
		
			
		
		
		
		
	
		
		

	}

}
