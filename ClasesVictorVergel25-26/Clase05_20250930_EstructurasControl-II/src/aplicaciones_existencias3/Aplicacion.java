package aplicaciones_existencias3;

import java.util.Scanner;

public class Aplicacion {

	static int variableGlobal=0;
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.->Valor de la variable"+variableGlobal);
		
		System.out.println("Inserte nombre:");
		String nombreUsuario=teclado.nextLine();
		System.out.println(nombreUsuario);
		
		int opcionMenu;
		do {
			opcionMenu=mostrarMenu(nombreUsuario);
			switch(opcionMenu) {
				case 1:
					if (!Funcionalidades.opcion1())
						System.out.println("Error en la ejecucion de la opcion 1");
					break;
				case 2:
					if (!Funcionalidades.opcion2())
						System.out.println("Error en la ejecucion de la opcion 2");
					break;
				case 3:
					if (!Funcionalidades.opcion3())
						System.out.println("Error en la ejecucion de la opcion 3");
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;					
				default:
					System.out.println("Opcion no valida");
			}
		}while(opcionMenu!=4);
		
	}
	
	public static int mostrarMenu(String nombreUsuario) {
		System.out.println("2.->Valor de la variable"+variableGlobal);
		int opcionSeleccionada=0;
		//Scanner teclado = new Scanner(System.in);
		System.out.println(nombreUsuario+ "Inserte opcion del menú a elegir:");
		System.out.println("1. Opcion 1");
		System.out.println("2. Opcion 2");
		System.out.println("3. Opcion 3");
		System.out.println("4. Salir");
		opcionSeleccionada=teclado.nextInt();
		return opcionSeleccionada;
	}
	
	
}
