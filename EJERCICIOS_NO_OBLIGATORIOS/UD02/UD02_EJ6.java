package ud02;

import java.util.Scanner;

public class Ejercicio6_tokio {

	public static void main(String[] args) {
		
		/*Realiza un programa que muestre el fragmento de la cadena de texto a partir de la posición de una palabra determinada (ambas
		cadenas introducidas por el usuario)*/
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String frase1=entrada.nextLine();
		
		System.out.println("Introduzca la posicion desde la que extraer un fragmento:");
		int posicion=entrada.nextInt();
		
		System.out.println(frase1.substring(posicion));


	}

}
