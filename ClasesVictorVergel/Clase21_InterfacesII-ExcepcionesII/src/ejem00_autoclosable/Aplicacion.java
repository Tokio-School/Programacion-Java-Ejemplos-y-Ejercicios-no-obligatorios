package ejem00_autoclosable;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in); Resource recurso = new Resource();) {
			System.out.println("Numero 1:");
			int a = teclado.nextInt();
			System.out.println("Numero 2:");
			int b = teclado.nextInt();

			System.out.println("Numero1 entre numero2:" + a / b);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Capturada la excepción");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
