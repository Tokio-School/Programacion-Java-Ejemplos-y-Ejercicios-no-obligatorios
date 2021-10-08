package com.tokioschool.ejerciciostp7;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
       int[] numbers = new int[10];
       Random generator = new Random();

       // Generamos los 10 números
       for (int i = 0; i < numbers.length; i++) {
           numbers[i] = generator.nextInt(100);
       }

       // Ordenamos los números
       Arrays.sort(numbers);

       System.out.println(Arrays.toString(numbers));
       // TODO ¿Cómo puedo pintar los números en orden descendente?
    }
}
