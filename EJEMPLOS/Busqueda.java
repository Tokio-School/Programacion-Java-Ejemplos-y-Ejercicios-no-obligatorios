package ud04;

import java.util.Scanner;

public class Busqueda {

	public static void main(String[] args) {
		
		int[] notas = new int[]{1, 4, 5, 8, 9, 9, 10};
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Qué nota quieres buscar?: ");
        int busqueda = Integer.parseInt(teclado.nextLine());

        // Buscamos la nota y paramos cuando la terminamos
        // En caso de encontrar marcamos a true el booleano
        boolean encontrado = false;
        for (int nota : notas) {
            if (nota == busqueda) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("La nota ha sido encontrada");
        } else {
            System.out.println("No se ha encontrado la nota especificada");
        }

        System.out.println("Fin");

	}

}
