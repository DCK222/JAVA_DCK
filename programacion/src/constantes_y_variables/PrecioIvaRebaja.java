/**
 * 
 */
package constantes_y_variables;

/**
 * @author alega
 *
 */
public class PrecioIvaRebaja {
	
	static int cantidad = 2;
	//se puede utilizar en todas las clases por que esta fuera de los corchetes

	
	public static void main(String[] args) {
		
		
		double precio = 40; // VARIABLE
		final double IVA = 1.10; //CONSTANTE
		
		//variable de tipo Float
		float numerocondecimales = 1.23F; 
		
		//Guardo el precio final en una variable
		double preciofinal = precio*IVA; 
		
		
		System.out.println("El precio del producto es: " + precio + " euros");
		System.out.println("El precio del producto con IVA es: " + preciofinal + " euros");
		
		//Cambiar 
		
		
		}

}


    