package com.tokioschool.holamundo;

/*
  Operadores unarios: pre/pos incremento/decremento
 */
public class PrePosIncremento {
    public static void main(String args[]) {
        int numero1 = 11;
        int numero2 = 2;

        System.out.println(++numero1);      // 12
        System.out.println(numero1);        // 12
        System.out.println(numero1++);      // 12
        System.out.println(numero1);        // 13

        System.out.println(--numero2);      // 1
        System.out.println(numero2);        // 1
        System.out.println(numero2--);      // 1
        System.out.println(numero2);        // 0

        int otroNumero = ++numero2;
        System.out.println(otroNumero);
    }
}
