package ud03;

import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		
		//Igual que el ejercicio 2 pero los valores m�nimo y m�ximo siempre se muestran (aunque sean impares)
		
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduzca el valor m�nimo: ");
        String number1 = keyboard.nextLine();
        System.out.print("Introduzca el valor m�ximo: ");
        String number2 = keyboard.nextLine();

        int minValue = Integer.parseInt(number1);
        int maxValue = Integer.parseInt(number2);

        System.out.print(minValue + " ");
        for (int i = minValue + 1; i < maxValue; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(maxValue + " ");

	}

}
