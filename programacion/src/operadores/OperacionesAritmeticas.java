/**
 * 
 */
package operadores;

public class OperacionesAritmeticas {

	
	public static void main(String[] args) {
		
		
		//DECLARAR E INICIAR DOS VARIABLES ENTERAS DE TIPO DOUBLE
		//MOSTRAR MULTIPLICACION, DIVISION, SUMA, RESTA Y MODULO
		//DIVISION CON 2 DECIMALES 
		
		double numero1 = 20;
		double numero2 = 5;
		int suma;
		suma = (int)(numero1+numero2);
		
		
		System.out.printf(" La Suma de %.0f y %.0f es %.0f: /n", numero1,numero2, + (numero1 + numero2));
		
		//LA SUMADE 10 Y 5 ES 15
		
		//System.out.println("la suma de " (int)numero1 + "y" (int)numero2 " es");
		
		System.out.println("Resta " + (numero1 - numero2));
		System.out.println("Multiplicacion " + (numero1 * numero2));
		System.out.println("Divisio " + (numero1 / numero2));
		System.out.println("Modulo " + (numero1 % numero2));
		
		
		double numero3 = 32.5;
		double numero4 = 2;
		
		System.out.println("DivisionDecimales " + (numero3 / numero4));
		
		
		
		
		
		

	}

}
