package com.tokioschool.holamundo;

/*
  Operadores lógicos
 */
public class OperadoresLogicos {
    public static void main(String args[]) {
        boolean terminadaFase1 = true;
        boolean terminadaFase2 = false;
        int x = 3;
        int y = 5;

        System.out.println("Ha terminado la fase 1?: " + terminadaFase1);
        System.out.println("No ha terminado la fase1?: " + !terminadaFase1);
        System.out.println("Ha terminado alguna fase?: " + (terminadaFase1 || terminadaFase2));
        System.out.println("Han terminado las dos fases?: " + (terminadaFase1 && terminadaFase2));

        System.out.println((x == 5) || (y == 3));
    }
}
