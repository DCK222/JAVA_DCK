import java.util.Scanner;
import java.util.Stack;

public class retoclase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<String> pilas = new Stack<>();

		System.out.println("Introduce la expresion: ");

		String expresion = sc.nextLine();

		char palabrerio[] = expresion.toCharArray();
		
		
			
			if (expresion.startsWith("(")&&expresion.endsWith(")")) {
				
				System.out.println("Expresion correcta");
			}
			
			else {
				System.out.println("expresion incorrecta");
			}
		

	}

}
