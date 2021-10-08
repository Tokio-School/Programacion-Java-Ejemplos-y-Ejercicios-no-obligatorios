package ud04;

import java.util.Arrays;

public class OperacionesConClaseArray {

	public static void main(String[] args) {
		
		int[] notas = new int[]{1, 40, 50, 16, 7, 8, 10};

        // Ordena el array
        Arrays.sort(notas);
        for (int nota : notas) {
            System.out.println(nota);
        }

        // La búsqueda binaria necesita que el array esté ordenado
        int posicion = Arrays.binarySearch(notas, 40);
        System.out.println(posicion);

        // Puedo alarga el array
        notas = Arrays.copyOf(notas, 10);
        for (int nota : notas) {
            System.out.println(nota);
        }

        // Puedo recortar el array
        notas = Arrays.copyOf(notas, 4);
        for (int nota : notas) {
            System.out.println(nota);
        }

	}

}
