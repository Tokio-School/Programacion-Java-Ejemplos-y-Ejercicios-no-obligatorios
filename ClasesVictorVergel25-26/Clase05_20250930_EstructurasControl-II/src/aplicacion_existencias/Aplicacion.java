package aplicacion_existencias;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte nombre:");
		String datoInsertado=teclado.nextLine();
		System.out.println(datoInsertado);
		
		String opcionMenu;
		do {
			System.out.println("Inserte opcion del menú a elegir:");
			mostrarMenu();
			opcionMenu=teclado.nextLine();
			switch(opcionMenu) {
				case "1":
					opcion1();
					break;
				case "2":
					opcion2();
					break;
				case "3":
					opcion3();
					break;
				case "4":
					System.out.println("Saliendo del programa");
					break;					
				default:
					System.out.println("Opcion no valida");
			}
		}while(!opcionMenu.equalsIgnoreCase("4"));
		
		
		
		
	}
	
	public static void mostrarMenu() {
		System.out.println("1. Opcion 1");
		System.out.println("2. Opcion 2");
		System.out.println("3. Opcion 3");
		System.out.println("4. Salir");
	}
	
	public static void opcion1() {
		System.out.println("Ha elegido la opcion 1");
	}
	public static void opcion2() {
		System.out.println("Ha elegido la opcion 2");
	}
	public static void opcion3() {
		System.out.println("Ha elegido la opcion 3");
	}

}
