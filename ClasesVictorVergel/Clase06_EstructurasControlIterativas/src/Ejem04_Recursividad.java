
public class Ejem04_Recursividad {

	public static void main(String[] args) {
		
		int numero = 5; // Cambia este número por el que desees calcular su factorial
		long factorial = calcularFactorial(numero);
		System.out.println("El factorial de " + numero + " es " + factorial);
	
	
		//Calcular la suma de los número pares hasta un determinado número
		int n = 5; 
        int suma = sumaNumeros(n);
        System.out.println("La suma de los números del 1 al " + n + " es: " + suma);
	
	}

	public static long calcularFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Caso base: factorial de 0 y 1 es 1
		} else {
			// Llamada recursiva: factorial(n) = n * factorial(n-1)
			return n * calcularFactorial(n - 1);
		}
	}
	
	
	public static int sumaNumeros(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNumeros(n - 1);
        }
    }
}
