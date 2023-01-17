/**
 * 
 */
package unidad3;

import java.util.Scanner;

public class NumerosFaltantes 
{


		
		public static int [] domain = new int[]{1, 2, 3, 4, 5,};

	    public static void printNumerosFaltantes(int[] values) {
	        for (int i = 0; i < domain.length; i++) {
	            boolean isNumeroFaltante = true;

	            for (int j = 0; j < values.length; j++) {
	                if (values[j] == domain[i]) {
	                    isNumeroFaltante = false;
	                }
	            }

	            if (isNumeroFaltante) {
	                System.out.println("Falta el número " + domain[i]);
	            }
	        }
	    }


	    public static void main(String[] args) {
	        // TODO code application logic here
	        int[] values = {5, 8, 4, 6, 2, 9};
	        NumerosFaltantes.printNumerosFaltantes(values);
	    }
	}

		
		

	


