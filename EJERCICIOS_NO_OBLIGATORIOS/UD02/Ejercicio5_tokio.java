package ud02;

import java.util.Scanner;

public class Ejercicio5_tokio {

	public static void main(String[] args) {
		
		//Realiza un programa que compruebe si un texto aparece en una cadena determinada (ambas introducidas por el usuario)
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduza una frase por favor: ");
		String frase1=teclado.nextLine();
		
		System.out.println("Vuelva a introducir una frase: ");
		String frase2=teclado.nextLine();
		
				
		if(frase1.contains(frase2)) {
			
			System.out.println("Se han encontrado similitudes, parte de su segunda frase está dentro de la primera.");
			
		}else {
			
			System.out.println("No se ha encontrado ninguna similitud entre las dos frases.");
		}

	}

}
