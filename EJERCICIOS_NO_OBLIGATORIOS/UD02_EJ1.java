package com.tokioschool.holamundo;

import java.util.Scanner;

/*
 * Ejercicio 1: Solicita dos números al usuario y muestra la suma de ambos
 */
public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String numero1 = teclado.nextLine();
        System.out.print("Introduce otro número: ");
        String numero2 = teclado.nextLine();

        int valor1 = Integer.parseInt(numero1);
        int valor2 = Integer.parseInt(numero2);

        int resultado = valor1 + valor2;
        System.out.println("La suma es " + resultado);
    }
}
