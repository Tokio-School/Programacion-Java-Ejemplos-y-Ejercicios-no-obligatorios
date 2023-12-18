package ejem01_entradaPorTecladoBytes;

import java.io.IOException;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner teclado=new Scanner(System.in);
		String cadena= teclado.next();
		System.out.println(cadena);
		teclado.close();*/
		
		/*System.out.println("Introduzca una letra");
		try {
			System.out.println((char)System.in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Introduzca una frase de 5 caracteres");
		byte cadena[]= {0,0,0,0,0};
		
		try {
			System.in.read(cadena);
			for (int i = 0; i < cadena.length; i++) {
				System.out.print((char)cadena[i]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
