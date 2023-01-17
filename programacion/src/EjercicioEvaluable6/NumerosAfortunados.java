package EjercicioEvaluable6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosAfortunados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    // SOLICITAMOS AL USUARIO UN NUMERO Y LO GUARDAMOS EN EL SCANNER
	    System.out.print("Introduce el numero afortunado: ");
	    int n = sc.nextInt();

	    // HACEMOS LA LISTA Y LA GUARDAMOS DE 1 A N
	    List<Integer> lista = new ArrayList<>();
	    for (int i = 1; i <= n; i++) {
	      lista.add(i);
	    }

	    // ELIMINAMOS NUMEROS
	    int m = 2;
	    while (lista.size() >= m) {
	      List<Integer> listaEliminados = new ArrayList<>();
	      for (int i = m - 1; i < lista.size(); i += m) {
	        listaEliminados.add(lista.get(i));
	      }
	      lista.removeAll(listaEliminados);
	      m++;
	    }

	    // FINALMENTE MOSTRAMOS LA LISTA
	    System.out.print("Números afortunados: ");
	    for (int i = 0; i < lista.size(); i++) {
	      System.out.print(lista.get(i) + " ");
	    }
	    


	}

}
