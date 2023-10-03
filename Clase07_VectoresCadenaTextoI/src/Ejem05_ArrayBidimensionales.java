import java.util.Iterator;

public class Ejem05_ArrayBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir las matrices a sumar
		int[][] matrizA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrizB = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		// Verificar si las matrices tienen las mismas dimensiones
		if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
			System.out.println("Las matrices no tienen las mismas dimensiones y no se pueden sumar.");
		} else {
			// Crear una matriz para almacenar la suma
			int filas = matrizA.length;
			int columnas = matrizA[0].length;
			int[][] suma = new int[filas][columnas];

			// Realizar la suma de matrices
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					suma[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}

			// Mostrar la matriz resultante (suma)
			System.out.println("Matriz resultante (suma):");
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					System.out.print(suma[i][j] + " ");
				}
				System.out.println();
			}
		}

		// Arrays bidimensionales con Strings
		String[][] comunidadesProvincias = {
				{ "Andalucía", "Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla" },
				{ "Aragón", "Huesca", "Teruel", "Zaragoza" }, { "Asturias", "Asturias" },
				{ "Cataluña", "Barcelona", "Girona", "Lleida", "Tarragona" },
				{ "Galicia", "A Coruña", "Lugo", "Ourense", "Pontevedra" }, { "Madrid", "Madrid" },
				{ "Valencia", "Alicante", "Castellón", "Valencia" } };

		// Mostrar la matriz bidimensional
		System.out.println("Comunidades Autónomas y Provincias:");

		for (int i = 0; i < comunidadesProvincias.length; i++) {
			System.out.print(comunidadesProvincias[i][0] + ": ");

			for (int j = 1; j < comunidadesProvincias[i].length; j++) {
				System.out.print(comunidadesProvincias[i][j]);
				if (j < comunidadesProvincias[i].length - 1) {
					System.out.print(", ");
				}
			}

			System.out.println(); // Salto de línea para separar las comunidades
		}
		
		

		
	}

}
