
public class Ejem02_Recursividad {

	public static void main(String[] args) {
		
		int numero = 5; // Cambia este número por el que desees calcular su factorial
		long factorial = calcularFactorial(numero);
		System.out.println("El factorial de " + numero + " es " + factorial);
		long factorialsSinRecursividad = calcularFactorialSinRecursividad(numero);
		System.out.println("El factorial de " + numero + " es " + factorialsSinRecursividad);		
		
		
	
		//Calcular la suma de los número pares hasta un determinado número
		int n = 5; 
        int suma = sumaNumeros(n);
        System.out.println("La suma de los números del 1 al " + n + " es: " + suma);
	
	}

	private static long calcularFactorialSinRecursividad(int numero) {
		// TODO Auto-generated method stub
		if (numero < 0) {
            return -1; // Factorial de números negativos no está definido
        }

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial =factorial* i;
        }

        return factorial;
		

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
