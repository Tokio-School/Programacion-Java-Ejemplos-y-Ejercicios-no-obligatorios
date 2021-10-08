import java.util.Scanner;

public class ArrayCaracteres {

	public static void main(String[] args) {
		
		String cuenta;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu cuenta: ");
        cuenta = teclado.nextLine();
        char[] digitosCuenta = cuenta.toCharArray();
        for (char c : digitosCuenta) {
          System.out.println(c);
        }
	}
}
