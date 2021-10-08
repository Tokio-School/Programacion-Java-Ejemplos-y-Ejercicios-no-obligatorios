package ud04;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Escribe un programa que solicite 5 notas al usuario y calcule la nota media
		
		int NUMERO_PRUEBAS = 5;
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[NUMERO_PRUEBAS];

        // Se introducen las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota: ");
            notas[i] = Integer.parseInt(teclado.nextLine());
        }

        // Se calcula la nota media
        // Si un alumno no se presenta tiene un -1 y esa nota no se tiene en cuenta
        float notaMedia = 0;
        int numeroNotas = 0;
        for (int nota : notas) {
            if (nota == -1)
                continue;

            notaMedia += nota;
            numeroNotas++;
        }
        notaMedia /= numeroNotas;

        System.out.println("La nota media es: " + notaMedia);

	}

}
