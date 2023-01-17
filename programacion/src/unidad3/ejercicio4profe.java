/**
 * 
 */
package unidad3;

/**
 * @author alega
 *
 */
public class ejercicio4profe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int [150];
		int contadorpares = 0;
		int contadorimpa = 0;
		
		for(int i = 0;i<numeros.length;i++)
		{
			int aleatorio = (int)(Math.random()*100);
			numeros [i]= aleatorio;
			
			
			if (aleatorio%2==0) 
			{
				
				contadorpares++;
			}
			else contadorimpa++;{
				
			}
			
			
		//creamos los arrays para los pares y los impares
			
		int pares[] = new int[contadorpares];
		
		
		
		int impares[] = new int[contadorimpa];
		
		//voy a rrellenar los arrays de pares e impares
		
		int j=0;
		int k=0;
		
		for(int i=0;i<numeros.length;i++) 
		
		if(numeros[i]%2==0)
			pares[j] = numeros[i];
		
		else
			impares[0] = numeros[i];
		}
		
			
			
		
			
		}

	}

}
