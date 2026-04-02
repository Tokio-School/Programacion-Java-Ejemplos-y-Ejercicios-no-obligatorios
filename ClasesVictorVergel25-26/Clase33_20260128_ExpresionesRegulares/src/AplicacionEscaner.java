import java.util.Scanner;

public class AplicacionEscaner {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		teclado.useDelimiter(",");
		while (teclado.hasNext()) {
			String token=teclado.next();
			System.out.println("Token: "+token);
		}

	}

}
