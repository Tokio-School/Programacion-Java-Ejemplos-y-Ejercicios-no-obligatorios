package ud03;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Escribe un programa que indique si una fecha introducida en format dd/MM/yyyy es correcta
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una fecha: ");

        String fecha = teclado.nextLine();
        int posicionPrimerSeparador = fecha.indexOf("/");
        int posicionSegundoSeparador = fecha.indexOf("/", posicionPrimerSeparador + 1);
        if (posicionPrimerSeparador == -1 || posicionSegundoSeparador == -1) {
            System.out.println("El separador utilizado no es válido");
            System.exit(0);
        }

        String dia = fecha.substring(posicionPrimerSeparador);

	}

}
