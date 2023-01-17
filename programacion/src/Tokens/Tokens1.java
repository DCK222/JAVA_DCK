package Tokens;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ForkJoinPool;

public class Tokens1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		
		String respuesta = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(respuesta,",");
		
		System.out.println("Tokens: " + st.countTokens());
				
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken().trim());
			
			
		}
		
		
	}
	
	
	

}
