package ud03;

import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		
		/*Escribe un programa que escriba por pantalla toda la secuencia entre dos n�meros introducidos por el usuario (un valor m�nimo y
		uno m�ximo). Realiza las comprobaciones previas sobre los datos introducidos*/
		
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduzca el valor m�nimo: ");
        String number1 = keyboard.nextLine();
        System.out.print("Introduzca el valor m�ximo: ");
        String number2 = keyboard.nextLine();

        int minValue = Integer.parseInt(number1);
        int maxValue = Integer.parseInt(number2);

        for (int i = minValue; i <= maxValue; i++) {
            System.out.print(i + " ");
        }

	}

}
