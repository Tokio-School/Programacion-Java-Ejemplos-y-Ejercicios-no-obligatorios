package ud04;

import java.util.Scanner;

public class IniciarArrays {

	public static void main(String[] args) {
		
		int[] notas;
        int[] masNotas = new int[5];
        String[] palabras = new String[]{"una", "dos", "tres"};
        Scanner teclado = new Scanner(System.in);

        // Asigno valores a las posiciones del array
        for (int i = 0; i < masNotas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            masNotas[i] = Integer.parseInt(teclado.nextLine());
        }

        // Pinto el contenido del array con el for tradicional
        for (int i = 0; i < masNotas.length; i++) {
            System.out.println(masNotas[i]);
        }

        // Pinto el contenido del array con el for-each
        for (int nota : masNotas) {
            System.out.println(nota);
        }

        // Puedo acceder directamente a cualquier posición del array
        System.out.println("La nota del examen número 3 es " + masNotas[2]);

        // Recorro con un for-each el array de palabras
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

	}

}
