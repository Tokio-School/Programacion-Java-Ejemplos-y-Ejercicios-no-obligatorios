import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 08/10/2024
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		
		
		int numero1=teclado.nextInt();
		
		if (numero1 == 0) 
			System.out.println("El número es el cero");
		else if (numero1 > 0) 
				System.out.println("El número es positivo");
			 else
				System.out.println("El número es negativo");

		System.out.println("Fin del programa");
		
		
		
		// 0-14 infantil, 15-18 jovenil, 18-25 joven, 25-60 adulto, 60-99 jubilado
		int edad=25;
		/*if (edad < 15)
			System.out.println("Infantil");
		else if (edad < 19)
			System.out.println("Jovenil");
		else if (edad < 26)
			System.out.println("Joven");
		else if (edad < 61)
			System.out.println("Adulto");
		else
			System.out.println("Jubilado");*/
		
		
		
		
		
		
	}

}
