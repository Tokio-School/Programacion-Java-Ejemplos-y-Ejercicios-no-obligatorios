package ejem04_Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String args[])
	{
		Scanner teclado=new Scanner(System.in);
		//System.out.println("Introduzca un texto");
		System.out.println("Introduzca un numero");
		int datoUsuario=0;
		
		
		boolean correcto=true;
		do {
			try (teclado) {
				datoUsuario = teclado.nextInt();
				correcto=true;
			} catch (InputMismatchException entradaErronea) {
				entradaErronea.printStackTrace();
				teclado.next(); //Capturamos el salto de l�nea
				System.out.println("Introduzca un numero");
				correcto=false;
			} 
		} while (!correcto);
		
		//teclado.close();
		System.out.println("El dato introducido es:" + datoUsuario);
		
	}
}
