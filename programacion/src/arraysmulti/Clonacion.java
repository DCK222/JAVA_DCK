package arraysmulti;

import java.util.Arrays;

public class Clonacion {

	public static void main(String[] args) {
		
		int [] primos = {1,2,3,5,7,11,13,17,19,23};
		int [] copia = new int [primos.length];
		int [] clonados= new int [copia.length];
		
		//1. EN COPIA COPIAMOS EL ARRAY PRIMOS
		//2. EN CLONADO CLONAMOS EL ARRAY PRIMOS
		//3. MOSTAMOS LOS ARRAYS POR CONSOLA
		//4. CAMBIAMOS UN ELEMENTO DE CLONADO
		//5.CAMBIAMOS UN ELEMENTO DE COPIA
		//6.VOLVEMOS A MOSTRAR POR PANTALLA LOS ARRAYS

		
		
		System.arraycopy(primos, 0, copia, 0, primos.length);
		clonados = copia.clone();
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copia));
		System.out.println(Arrays.toString(clonados));
		
		
		copia [5] = 8;
		clonados [4] = 6;
		
		
		
		
	}

}
