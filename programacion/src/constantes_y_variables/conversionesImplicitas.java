/**
 * 
 */
package constantes_y_variables;

public class conversionesImplicitas {

	public static void main(String[] args) {

		
		
		//byte= -127 a 128
		
		int dato1= 3;
		
			System.out.println(dato1);
			short dato2 = 5;
			System.out.println(dato2);
			dato1 = dato2;
			
			System.out.println(dato2);
			
			
		int idato=5;
		byte bdato;
		bdato = (byte) idato;
		
		System.out.println(bdato);
		
		double idatoo= 5.5;
		bdato = (byte) idatoo;
		System.out.println(bdato);
		
			
		
		
		

	}

}
