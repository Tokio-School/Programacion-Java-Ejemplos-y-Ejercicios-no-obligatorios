package ejem02_losbasicos;

import java.util.Random;

public class EjemploRandom {
    public static void main(String[] args) {
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número entero aleatorio entre 0 y 9
        int numeroEntero = random.nextInt(10);
        System.out.println("Número entero aleatorio entre 0 y 9: " + numeroEntero);

        // Generar un número de punto flotante aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo)
        double numeroDecimal = random.nextDouble();
        System.out.println("Número de punto flotante aleatorio entre 0.0 y 1.0: " + numeroDecimal);

        // Generar un número entero aleatorio en un rango personalizado
        int rangoMinimo = 5;
        int rangoMaximo = 15;
        int numeroPersonalizado = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
        System.out.println("Número entero aleatorio en el rango " + rangoMinimo + " - " + rangoMaximo + ": " + numeroPersonalizado);
    }
}
