
public class Ejem06_Recursividad {

	public static void main(String[] args) {
		int numero = 5; // Cambia este número por el que desees calcular su factorial
		long factorial = calcularFactorial(numero);
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

	public static long calcularFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Caso base: factorial de 0 y 1 es 1
		} else {
			// Llamada recursiva: factorial(n) = n * factorial(n-1)
			return n * calcularFactorial(n - 1);
		}
	}

}
