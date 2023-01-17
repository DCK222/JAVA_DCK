/**
 * 
 */
package constantes_y_variables;

public class Tipos_Primitivos {

	public static void main(String[] args) {
		
		boolean esCorrecto;
		esCorrecto = true;
		
		System.out.println("Mi clave es correcta? " + esCorrecto);
		
		boolean esincorrecto;
		esincorrecto = false;
		
		System.out.println("Es correcta mi clave?" + esincorrecto);
		System.out.println("Es correcta mi clave?" + esCorrecto);
		
		//CAMBIAR EL VALOR DE UNA VARIABLE
		int cantidadManzanas = 20;
		
		
		System.out.println("inicialmente tengo: " + cantidadManzanas  + "manzanas");
		
		cantidadManzanas = cantidadManzanas - 5;
		
		System.out.println("Finalmente tengo " + cantidadManzanas + " Manzanas");
		
		
		
		//Ejercicio clase, conversion a pulgadas:
		
		final double pulgadascm = 2.54;
		int datocm = 6;
		
		System.out.println("inicialmente tengo " + datocm + " cm" +" y una pulgada son " + pulgadascm + " cm"  );
		System.out.println("Finalmente 6 cm convertidos a pulgadas son " + datocm / pulgadascm);
		//fin ejercicio.

		
		final float apulgadas = 2.54F; //constante
		double cm = 6.87654;
		double solucion = cm / apulgadas;
		
		System.out.println(cm+ " centimetron son " + solucion + " Pulgadas");
		
		System.out.printf(cm + " centimetros son %.4f pulgadas ", solucion);
		
		//6,87 cm son 2,362
		
		//System.out.printf("%.2f centimetros son %.3f pulgadas ", solucion);
		
		// fin.
		
		//casting
		
		double precio = 4.25;
		int centimos = ((int)precio * 100);
		
		System.out.println(centimos);
		
		
		
		
		
		
		
		
		
		
		

	}

}
