package ud03;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		
		//Programa para adivinar un n�mero con intentos limitados
		
		Scanner keyboard = new Scanner(System.in);
        final int TRIES = 5;
        int userTries = 0;

        // TODO Tambi�n se puede pedir al usuario que introduzca datos como dificultad, n�mero de intentos o bien
        // los limites dentro de los cuale el ordenador se puede pensar el n�mero

        // El ordenador se piensa un n�mero
        Random generator = new Random();
        int computerValue = generator.nextInt(19) + 1;

        while (userTries < TRIES) {
            // Se pide n�mero al usuario

            // Se comprueba si el usuario ha acertado y se le da la pista correspondiente

            // Se consume un intento
            userTries--;
        }

        // Si llegamos aqui comprobar si ha sido porque se ha acertado o bien
        // porque se han gastado los intentos

	}

}
