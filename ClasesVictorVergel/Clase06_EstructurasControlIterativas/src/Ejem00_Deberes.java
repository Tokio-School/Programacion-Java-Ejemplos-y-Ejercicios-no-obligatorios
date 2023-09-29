
public class Ejem00_Deberes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Mostrar: 
		 * * 
		 * ** 
		 * *** 
		 * ****
		 */
		for (int i = 1; i <= 5; i++) { // Filas
			// Asteriscos para el lado izquierdo
			for (int j = 1; j <= i; j++) { // Columnas
				System.out.print("*");
			}

			System.out.println(); // Salto de línea para la siguiente fila
		}

		/**
		 * Mostrar: 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5
		 */
		int altura = 10; // Cambia la altura del triángulo según tus necesidades

		for (int i = 1; i <= altura; i++) {
			// Imprimir números para la fila actual
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println(); // Salto de línea para la siguiente fila
		}

		// Recorrer una cadena de texto y contar vocales
		String cadenaTexto = "esto es una cadena de texto corta";
		int contador = 0;
		int noVocales=0;
		for (int i = 0; i < cadenaTexto.length(); i++) {
			char caracter = cadenaTexto.charAt(i);

			
			switch (caracter) {
			/*case 'a', 'e', 'i', 'o', 'u':
				contador++; */
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				contador++;
				break;
			default:
				noVocales++;
				
			}
		}
		System.out.println("Numero de vocales"+contador);
		System.out.println("Numero de no vocales:"+noVocales);
	}

}
