package com.tokioschool.holamundo;

/*
    Conversión de tipos y parseo de valores
 */
public class Conversiones {
    public static void main(String args[]) {
        float numeroDecimal = 3.9f;

        int numero = (int) numeroDecimal;
        System.out.println(numero);

        numeroDecimal = numero;

        long numeroLong = 30;

        String cadena = "3000";
        int numeroEntero = Integer.parseInt(cadena);
        System.out.println(numeroEntero);

        String numeroFinal = String.valueOf(numeroEntero);
        System.out.println(numeroFinal);

    }
}
