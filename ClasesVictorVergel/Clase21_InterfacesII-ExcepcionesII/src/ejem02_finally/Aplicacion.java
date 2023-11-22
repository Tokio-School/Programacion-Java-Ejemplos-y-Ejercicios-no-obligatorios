package ejem02_finally;

public class Aplicacion {

	 public static void main(String[] args) {
	        int[] numeros = {1, 2, 3, 4, 5};

	        try {
	            // Intentar acceder a un índice fuera de los límites del array
	            int resultado = obtenerElementoEnIndice(numeros, 10);
	            System.out.println("Resultado: " + resultado);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Se intentó acceder a un índice fuera de los límites del array.");
	        } finally {
	            // Este bloque se ejecutará siempre, independientemente de si se produce una excepción o no.
	            System.out.println("Acción en el bloque finally: Este mensaje siempre se mostrará.");
	        }
	    }

	    // Método que intenta obtener un elemento en un índice del array
	    private static int obtenerElementoEnIndice(int[] array, int indice) {
	        return array[indice];
	    }

}
