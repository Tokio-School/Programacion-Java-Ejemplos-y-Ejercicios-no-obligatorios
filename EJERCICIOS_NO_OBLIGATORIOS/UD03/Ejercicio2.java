package ud03;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Escribe un programa que indique si un n�mero introducido por el usuario es par o impar
		
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduzca un n�mero: ");
        String number = keyboard.nextLine();

        // Comprobar si los valores introducidos son correctos (num�ricos)
        if ((!number.matches("[0-9]*"))) {
            System.out.println("El n�mero introducido no es correcto");
            // Sale del programa
            System.exit(0);
        }

        int value = Integer.parseInt(number);
        if (value % 2 == 0) {
            System.out.println("El n�mero es par");
        } else {
            System.out.println("El n�mero es impar");
        }

	}

}
