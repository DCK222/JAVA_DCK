package arraysmulti;

import java.util.Arrays;
import java.util.Scanner;

public class TransportaArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] entrada1 = {1,2,3,4,5,6,7};
		
		int [] producto = new int[entrada1.length];
		
		int [] arrayfinal = new int [entrada1.length];
		
		
		System.out.println("¿Cuantas veces quieres que e mueva hacia la derecha?");
		
		int k = sc.nextInt();
		
		System.arraycopy(entrada1, 0, producto, k, entrada1.length - k);
		System.arraycopy(entrada1, 0, arrayfinal, 0, k);
		
		//Imprimimos.
		
		System.out.println(Arrays.toString(entrada1));
		System.out.println(Arrays.toString(producto));
		
		
		System.out.println(Arrays.toString(arrayfinal));
		
		
		
		
		
		
		

	}

}
