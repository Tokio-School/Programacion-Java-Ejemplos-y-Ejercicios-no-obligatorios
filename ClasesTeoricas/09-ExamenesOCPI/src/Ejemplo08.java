
public class Ejemplo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		switch (x) {
		    case 1,2 -> System.out.println("Uno o dos");
		    case 3 -> System.out.println("Tres");
		    default -> System.out.println("Otro");
		}
		switch (x) {
	    case 1,2 : System.out.println("Uno o dos");
	    	break;
	    case 3 : System.out.println("Tres");
	    	break;
	    default : System.out.println("Otro");

	}
	}
/**
 * Opciones:
A) Uno o dos
B) Tres
C) Otro
D) Error de compilación
 */
}
