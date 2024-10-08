import java.util.Scanner;

public class AplicacionBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables contadores: i, j, k
		//for (int i = 0; i < 10; i++) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número de la tabla de multiplicar que quieres: ");
		int numero = teclado.nextInt();
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+" x "+numero+" = " + (i+1)*numero);
		}
		
		System.out.println("La potencia de "+numero+" elevado al "+numero+" es: "+potencia(numero));
		
		
		
		for (int filas = 0; filas < 10; filas++) {
			for (int columnas = 0; columnas < filas+1; columnas++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int valor = 10; valor >0; valor--) {
			System.out.println(valor);
		}
		
	}
	
	
	public static int potencia(int numero) {
		int auxiliar=numero;
		for (int i = 1; i < auxiliar; i++) {
			numero = auxiliar * numero;
		}
		return numero;
	}

}
