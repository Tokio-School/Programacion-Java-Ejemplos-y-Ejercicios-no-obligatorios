package ud03;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

        System.out.println("Conversor de monedas Tokio");
        System.out.println("1. Pasar de Euros a D�lares");
        System.out.println("2. Pasar de D�lares a Euros");
        System.out.print("Opci�n> ");
        String choice = keyboard.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Introduzca la cantidad: ");
                String number = keyboard.nextLine();
                float value = Float.parseFloat(number);
                float result = value * 0.86f;
                System.out.println(value + " Euros son " + result + " D�lares");
                break;
            case "2":
                System.out.print("Introduzca la cantidad: ");
                number = keyboard.nextLine();
                value = Float.parseFloat(number);
                result = value * 1.17f;
                System.out.println(value + " D�lares son " + result + " Euros");
                break;
            default:
                System.out.println("Opci�n incorrecta");
                System.exit(0);
                break;
        }


	}

}
