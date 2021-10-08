package com.tokioschool.ejerciciostp7;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] dictionary = new String[]{"casa", "coche", "ordenador", "java", "curso", "gotomeeting"};
        Scanner keyboard = new Scanner(System.in);
        boolean wordFound = false;

        System.out.print("¿Qué palabra quieres buscar: ");
        String searchWord = keyboard.nextLine();
        for (String word : dictionary) {
            if (searchWord.equals(word)) {
                wordFound = true;
                break;
            }
        }

        if (wordFound) {
            System.out.println("La palabra está en la lista");
        } else {
            System.out.println("La palabra no está en la lista");
        }
    }
}
