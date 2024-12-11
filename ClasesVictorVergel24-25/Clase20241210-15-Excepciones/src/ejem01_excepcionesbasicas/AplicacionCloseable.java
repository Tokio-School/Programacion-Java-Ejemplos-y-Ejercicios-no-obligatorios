package ejem01_excepcionesbasicas;

import java.util.Scanner;

public class AplicacionCloseable {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in);
			MiRecurso recurso2 = new MiRecurso();) {
			System.out.println("Introduzca un texto:");
			String cadena=teclado.nextLine();
			System.out.println("Texto introducido: "+cadena);
			//teclado.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Errroooorrr");
			e.printStackTrace();
			
		} 

	}

}
