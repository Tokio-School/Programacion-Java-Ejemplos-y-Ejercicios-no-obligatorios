package ud03;

import java.util.Scanner;

public class EjemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Menú");
        System.out.println("a. Opción a");
        System.out.println("b. Opción b");
        System.out.println("c. Opción c");
        System.out.println("d. Opción d");

        System.out.print("Introduce una opción: ");
        String opcion = teclado.nextLine();
        switch (opcion) {
            case "a":
                System.out.println("Has escogido la opción a");
                break;
            case "b":
            case "c":
            case "d":
                System.out.println("Has escogido la opción d");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

        System.out.println("aqui sigo después del switch-case");

	}

}
