import java.util.Scanner;

public class Ejem05_TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");

		// Leer el número ingresado por el usuario
		int numero = scanner.nextInt();

		// Mostrar la tabla de multiplicar
		mostrarTablaDeMultiplicar(numero);

		scanner.close();
	}

	public static void mostrarTablaDeMultiplicar(int numero) {
		System.out.println("Tabla de multiplicar del " + numero + ":");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}

}
