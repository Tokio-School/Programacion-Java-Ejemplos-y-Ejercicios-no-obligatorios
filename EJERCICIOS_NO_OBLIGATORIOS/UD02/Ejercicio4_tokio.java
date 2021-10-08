package ud02;

import java.util.Scanner;

public class Ejercicio4_tokio {

	public static void main(String[] args) {
		
		//Realiza un programa que calcule el área de un triángulo (areaTriangulo = base * altura / 2)
		
		Scanner introducir=new Scanner(System.in);
		
		System.out.println("Introduzca la base del triángulo: ");
		String num1=introducir.nextLine();
		
		System.out.println("Introduzca la altura del triángulo: ");
		String num2=introducir.nextLine();
		
		int base=Integer.parseInt(num1);
		int altura=Integer.parseInt(num2);
		
		double area=(base*altura)/2;
		
		System.out.println("El área de un triángulo de base "+String.valueOf(base)+" y altura "+String.valueOf(altura)+" es de "+area);

	}

}
