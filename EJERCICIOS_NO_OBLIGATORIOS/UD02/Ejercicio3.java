package ud02;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Ejercicio 3. Realiza un programa que muestre por pantalla un número aleatorio entre dos valores introducidos por el usuario
		
		Scanner keyboard = new Scanner(System.in);

	       System.out.print("Introduzca el primer número: ");
	       String number1 = keyboard.nextLine();
	       System.out.print("Introduzca el segundo número: ");
	       String number2 = keyboard.nextLine();

	       int value1 = Integer.parseInt(number1);
	       int value2 = Integer.parseInt(number2);

	       Random generator = new Random();
	       int randomValue = generator.nextInt(value2 - value1) + value1;
	       System.out.println("El número aleatorio generado entre esos valores es " + randomValue);

	}

}
