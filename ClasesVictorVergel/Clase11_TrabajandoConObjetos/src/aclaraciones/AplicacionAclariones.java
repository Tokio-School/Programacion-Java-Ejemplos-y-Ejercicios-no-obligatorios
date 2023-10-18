package aclaraciones;

import java.util.Scanner;

public class AplicacionAclariones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número");
		System.out.println(teclado.nextInt());
		
		System.out.println("Introduzca una cadena");
		System.out.println(teclado.nextLine());
		
		teclado.close();
		
		
		/*String cadena1="Victor";
		String cadena2="Victor";*/
		String cadena1=new String("Victor");
		String cadena2=new String("Victor");
		
		if (cadena1==cadena2)
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		if (cadena1.equals(cadena2))
			System.out.println("Son iguales con equals");
		else
			System.out.println("No son iguales con equals");
		
		
		
		
		

	}

}
