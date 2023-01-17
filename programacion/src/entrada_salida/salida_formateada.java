/**
 * 
 */
package entrada_salida;

public class salida_formateada {

	public static void main(String[] args) {
		
		String animal1 = "perro";
		String animal2 = "gato";
		String animal3 = "pajaro";
		
		System.out.println("******* PALABRAS *******");
		System.out.println("------------------------");
		System.out.printf("%-10s %-10s %-10s \n", animal1, animal2, animal3);
		System.out.printf("%-10s %-10s %-20s", "amarillo", "verde", "morado");
		
		
		
		

	}

}
