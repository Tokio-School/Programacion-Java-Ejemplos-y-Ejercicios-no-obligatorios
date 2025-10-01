import java.util.Scanner;

public class Aplicacion3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		int opcionSeleccionada = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			mostrarMenu();

			opcionSeleccionada = scanner.nextInt();
			// recuperarContrasena();
			//while (opcionSeleccionada == 1) {
				// System.out.println("Opcion no valida, elige otra");

				//opcionSeleccionada = scanner.nextInt();
				switch (opcionSeleccionada) {
				case 1:
					recuperarContrasena();
					break;
				case 2:
					saludar();
					break;
				case 3:
					salir = false;
					break;
				}
			//}
		} while (salir);
		;
		despedirse();

		// saludar();
	}

	private static void despedirse() {
		// TODO Auto-generated method stub
		System.out.println("Adios");
	}

	private static void recuperarContrasena() {
		// TODO Auto-generated method stub
		System.out.println("Recuperando contraseña");
	}

	public static void saludar() {
		System.out.println("Hola");
	}

	public static void mostrarMenu() {

		System.out.println("1. Opcion 1.recuperar contaseña");
		System.out.println("2. Opcion 2. Saludar");
		System.out.println("3. Salir 3. despedirse");
	}

}
