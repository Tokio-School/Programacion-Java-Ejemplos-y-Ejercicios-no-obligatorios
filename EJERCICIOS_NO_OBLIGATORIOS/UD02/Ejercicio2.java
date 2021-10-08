package com.tokioschool.holamundo;

import java.util.Scanner;

/*
    Ejercicio 2: Mostrar cuántos dígitos tienen un número introducido por el usuario
 */
public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        String numero = teclado.nextLine();

        int cantidadDigitos = numero.length();
        System.out.println("El número tiene " + cantidadDigitos);
    }
}
