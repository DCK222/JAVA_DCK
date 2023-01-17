package clasesstring;

public class ClaseStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder miPrimerSB = new StringBuilder("Mi primer stringbuilder");
				
		miPrimerSB.append(" en Java");
		System.out.println(miPrimerSB);
		System.out.println(miPrimerSB.length());
		System.out.println(miPrimerSB.capacity());
		System.out.println("Esto es un error");
		
		miPrimerSB.insert(2, " Unico ");
		System.out.println(miPrimerSB);
		System.out.println(miPrimerSB.length());
		System.out.println(miPrimerSB.capacity());
		System.out.println(miPrimerSB.reverse());
		System.out.println(miPrimerSB.toString().toUpperCase());
	}

}
