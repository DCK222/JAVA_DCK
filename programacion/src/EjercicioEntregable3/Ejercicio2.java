/**
 * 
 */
package EjercicioEntregable3;


import java.util.Scanner;

public class Ejercicio2 {


	public static void main(String[] args) {
		
		 Scanner sc=new Scanner (System.in); //INICIAMOS SCANNER
	        int num[]= new int[5]; //PONEMOS CON VARIABLE INT EL ARRAY DE DE MAXIMO 5

	        System.out.println("Ejemplo de ejecucion:"); //ENUNCIADO 1
	        System.out.println("Introduce numeros del 1-5 cuando lo pida."); //ENUNCIADO 2


	        for (int i=0;i<num.length-1;i++)  //INICIAMOS FOR 
	        
	        {
	        System.out.println("Pieza (1-5):");
	        int piezas=sc.nextInt(); //REGISTRAS LOS VALORES INTRODUCIDOS POR EL USUAARIO
	        num[piezas-1]=piezas; //DICHOS NUMEROS A LAS PIEZAS LE RESTAMOS -1 PARA QUE RELLENA LA POSICION DE LOS DATOS
	        
	        }

	       
	        for(int i=0;i<num.length;i++) //INICIALIZAMOS OTRO FOR
	        
	        {
	            if(num[i]==0)//DECLARAMOS EL IF PARA QUE RELLENE LAS POSICIONES VACIAS
	            {
	            System.out.println("Falta la pieza numero:" +(i+1)); //FINALMENTE HACEMOS UN SISO EN EL CUAL META EL NUMERO QUE NO SE HA PUESTO
	            }
	            
	            sc.close();//CERRAMOS EL SCANNER
	            
	        }
	        
	    }


      }
  

	    

