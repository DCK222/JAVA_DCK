package Conjuntos;
import java.util.LinkedHashSet;
public class EjercicioLinkedhashSet {

	public static void main(String[] args) {
		
		
		String nombres[] = {"Alfredo", "Zacarias" , "Sturrige", "Memento"};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Los nombres son: " + nombres[i]);
		}
		
		LinkedHashSet <String> listanombres = new LinkedHashSet <>();
		
		listanombres.add(null);
		listanombres.add(null);
		
		System.out.println("LINKED CON NULOS " + listanombres);
		listanombres.remove(null);
		
		listanombres.addAll(listanombres);
		
		

	}

}
