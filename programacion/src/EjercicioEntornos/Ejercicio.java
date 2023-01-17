package EjercicioEntornos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio {

	public static void main(String[] args) {
		
	    int[] numbers = new int[10];
	    Random random = new Random();
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = random.nextInt(100);
	    }

	    //ARRAY ANTES DE ORDENARLO
	    System.out.println("Array antes de ordenar: " + Arrays.toString(numbers));

	    // ORDENAMOS EL ARRAY DE MANOR A MAYOR
	    Arrays.sort(numbers);

	    // IMPRIMIMOS EL ARRAY ORDENADO
	    System.out.println("Array después de ordenar: " + Arrays.toString(numbers));

	}

}
