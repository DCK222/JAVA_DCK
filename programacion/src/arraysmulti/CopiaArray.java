package arraysmulti;

import java.util.Arrays;

public class CopiaArray {

	public static void main(String[] args) {
		
		
		int [] primos = {1,2,3,5,7,11,13,17,19,23};
		
		int [] copia = new int[primos.length];
		
		
		//COPIA
		
		System.arraycopy(primos, 1, copia, 2, 6);
		
		//MUESTRO PANTALLA
		
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copia));
		
		
		
		

	}

}
