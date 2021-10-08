package ud03;

import java.util.Scanner;

public class EjemploIf {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Comienzo del programa");
        System.out.print("Introduzca su edad (>18): ");

        int numero = Integer.parseInt(teclado.nextLine());
        if (numero < 18) {
            System.out.println("No está autorizado");
            System.exit(0);
        }

        System.out.println("Aqui va el programa");
        System.out.println("Aqui va el programa");
        System.out.println("Aqui va el programa");
        System.out.println("Aqui va el programa");
        System.out.println("Aqui va el programa");
        System.out.println("Aqui va el programa");
        System.out.println("Fin del programa");

	}

}
