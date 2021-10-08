package ud03;

import java.util.Scanner;

public class Ejercicio2_1 {

	public static void main(String[] args) {
		
		//Modifica el programa anterior para que sólo liste por la pantalla los números pares entre los dos valores límite
		
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduzca el valor mínimo: ");
        String number1 = keyboard.nextLine();
        System.out.print("Introduzca el valor máximo: ");
        String number2 = keyboard.nextLine();

        int minValue = Integer.parseInt(number1);
        int maxValue = Integer.parseInt(number2);

        for (int i = minValue; i <= maxValue; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

	}

}
