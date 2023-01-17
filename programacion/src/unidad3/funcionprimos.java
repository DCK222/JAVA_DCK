/**
 * 
 */
package unidad3;

import java.util.Iterator;

public class funcionprimos {


	public static void main(String[] args) 
	{
		

	}
	
	//FUNCION QUE ME DIGA SI ES PRIMO O NO
	
	public static boolean esprimo(int n) 
	{
		for (int i = 2; i<n; i++)
		{
			if(n%i==0)
				return false;
			
		}
		return true;
		
	}
	
	
	//Funcion para rellenar un array de numeros primos
	public static int[] rellenarArrayPrimos() 
	{
		int [] array = new int [10];
		
		for(int i = 0; i<array.length;i++ ) 
		{
			int aleatorio = (int)(Math.random()*1000);
			
			while(esPrimo(aleatorio)==false) {
				aleatorio = (int)(Math.random()*1000);
			}
			
			array[i]=aleatorio;
		}
	
	
	
	
	}

}
