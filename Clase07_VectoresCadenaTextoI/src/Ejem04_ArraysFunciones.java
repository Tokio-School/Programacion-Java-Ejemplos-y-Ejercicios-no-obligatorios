import java.util.Arrays;

public class Ejem04_ArraysFunciones {
	public static void main(String args[]) {

		// Creación de un array de enteros
		int[] numeros = { 5, 2, 9, 1, 5, 6, 3 };

		//Nuevo bucle con arrays.
		for (int valor : numeros) {
			System.out.print(valor+" ");
		}
		System.out.println(" ");
		
	
		// Mostrar el array original
		System.out.println("array original: " + Arrays.toString(numeros));

		// Ordenar el array en orden ascendente
		Arrays.sort(numeros);

		// Mostrar el array ordenado
		System.out.println("array ordenado: " + Arrays.toString(numeros));

		// Buscar un elemento en el array (por ejemplo, el número 5)
		int elementoBuscado = 55;
		int indice = Arrays.binarySearch(numeros, elementoBuscado);

		
		if (indice >= 0) {
			System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + indice);
		} else {
			System.out.println("El elemento " + elementoBuscado + " no se encuentra en el array.");
		}

		
		// Creación de un array de cadenas
		String[] nombres = { "Carlos", "Pedro", "Maria", "Luisa" };

		// Mostrar el array original
		System.out.println("array original: " + Arrays.toString(nombres));

		// Copiar un array a otro
		String[] copiaNombres = Arrays.copyOf(nombres, nombres.length);

		// Mostrar la copia del array
		System.out.println("Copia del array: " + Arrays.toString(copiaNombres));

		// Comprobar si dos arrays son iguales
		boolean sonIguales = Arrays.equals(nombres, copiaNombres);
		System.out.println("¿Los arrays son iguales? " + sonIguales);

		// Llenar un array con un valor específico
		int[] numeros2 = new int[5];
		Arrays.fill(numeros2, 42);

		// Mostrar el array lleno
		System.out.println("array lleno: " + Arrays.toString(numeros2));



	}
}
