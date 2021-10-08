package ud03;

import java.util.Scanner;

public class EjemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Men�");
        System.out.println("a. Opci�n a");
        System.out.println("b. Opci�n b");
        System.out.println("c. Opci�n c");
        System.out.println("d. Opci�n d");

        System.out.print("Introduce una opci�n: ");
        String opcion = teclado.nextLine();
        switch (opcion) {
            case "a":
                System.out.println("Has escogido la opci�n a");
                break;
            case "b":
            case "c":
            case "d":
                System.out.println("Has escogido la opci�n d");
                break;
            default:
                System.out.println("Opci�n incorrecta");
                break;
        }

        System.out.println("aqui sigo despu�s del switch-case");

	}

}
