
public class Ejemplo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    System.out.println(1/0);
		} catch (ArithmeticException e) {
		    System.out.println("Error");
		} finally {
		    System.out.println("Fin");
		}
	}

}
/**
 * Opciones:
A) Error
B) Fin
C) Error Fin
D) No imprime nada*/
