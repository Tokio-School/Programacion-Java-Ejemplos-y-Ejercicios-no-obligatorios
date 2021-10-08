package ud03;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Escribe un programa que indique, para dos números dados, cuál es mayor
		
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        String number1 = keyboard.nextLine();
        System.out.print("Introduzca el segundo número: ");
        String number2 = keyboard.nextLine();

        // Comprobar si los valores introducidos son correctos (numéricos)
        if ((!number1.matches("[0-9]*")) || (!number2.matches("[0-9]*"))) {
            System.out.println("Alguno de los números introducidos no es correcto");
            // Sale del programa
            System.exit(0);
        }

        int value1 = Integer.parseInt(number1);
        int value2 = Integer.parseInt(number2);

        if (value1 > value2) {
            System.out.println("El primer número es mayor");
        } else if (value2 > value1){
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Son iguales");
        }

	}

}
