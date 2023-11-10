package ejem01_argumentosmultiples;

public class EjemploMetodoVarargs {

    // Método que toma un número indeterminado de enteros y devuelve su suma
    public static int sumar(int... numeros) {
        int suma = 0;
        
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método sumar con diferentes cantidades de argumentos
        int resultado1 = sumar(1, 2, 3);
        int resultado2 = sumar(10, 20, 30, 40, 50);

        System.out.println("La suma 1 es: " + resultado1);
        System.out.println("La suma 2 es: " + resultado2);
    }
}
