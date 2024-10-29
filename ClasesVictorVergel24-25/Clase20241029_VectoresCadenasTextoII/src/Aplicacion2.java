import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[][] = {{1,2,3,4},{5,6,7,8},{9,7,5,4}};
		
		/*for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}*/
		mostrar(numeros);
		
		
		String cadenas[][]=new String [2][3];
		Scanner teclado=new Scanner(System.in);
	/*	for (int i = 0; i < 6; i++) {
			System.out.println("Introduce una cadena:");
			cadenas[i / 3][i % 3] = teclado.nextLine();
		}*/
		
		/*cadenas[0][0]="Hola";
		cadenas[0][1]="Mundo";
		cadenas[0][2]="Java";
		cadenas[1][0]="Hola";
		cadenas[1][1]="Mundo";
		cadenas[1][2]="Java";*/
		System.out.println("-------------");
		mostrar(cadenas);
		
		
		int [] numeros2 = {4,5,6,7,1,2,3,8,9,10};
		for (int num : numeros2) {
			System.out.print(num + " ");
		}
		System.out.println("---------------");
		Arrays.sort(numeros2);
		for (int num : numeros2) {
			System.out.print(num + " ");
		}
		System.out.println("---------------");
		int numeros2_corado[]=Arrays.copyOf(numeros2, 50);
		for (int num : numeros2_corado) {
			System.out.print(num + " ");
		}
		
		
				
	}

	public static void mostrar(int[][] numeros) {
		for (int[] nums : numeros) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
		}
	}

	
	public static void mostrar(String[][] cadenas) {
		for (String[] cads : cadenas) {
            for (String cad : cads) {
                System.out.print(cad + " ");
            }
            System.out.println();
		}
	}
	
}
