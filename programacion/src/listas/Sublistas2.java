package listas;

import java.util.Arrays;
import java.util.List;

public class Sublistas2 {

	public static void main(String[] args) {
		
		
		List<String> diasemana = Arrays.asList("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
		
		List<String> SublistaSemana = diasemana.subList(2, diasemana.size());
		
		System.out.println("Lista Completa: " + diasemana);
		System.out.println("Sublista: " + SublistaSemana);

	}

}
