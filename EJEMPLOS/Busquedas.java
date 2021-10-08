package ud04;

import java.util.Scanner;

public class Busquedas {

	public static void main(String[] args) {
		
		String texto = "Esto es un texto donde voy a buscar palabras. Hola";
        String busqueda;
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Qué cadenas quieres buscar? ");
        busqueda = teclado.nextLine();
        // Elimina espacios a los lados
        busqueda = busqueda.trim();

        // indexOf devuelve -1 si no encuentra la cadena por lo que también vale
        // para saber si una cadena está o no
        int posicion = texto.indexOf(busqueda);

        /*
        Puedo guardarlo en minúscula
        texto = texto.toLowerCase();
        busqueda = busqueda.toLowerCase();
        */

        if (texto.toLowerCase().contains(busqueda.toLowerCase())) {
            System.out.println("La palabra se ha encontrado");
            System.out.println("La cadena está en la posición " + posicion);
        }
        else
            System.out.println("La palabra no se ha encontrado");

	}

}
