import java.util.Arrays;
import java.util.Scanner;

public class Ejem02_ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] datos= {{0,1,2},{3,4,5}};
		mostrarArrayBidimensional(datos);
		
		int [][] datosPedidos=new int[4][2];
		//Scanner teclado=new Scanner(System.in);
		for (int i = 0; i < datosPedidos.length; i++) {
			//for (int j = 0; j < datosPedidos[i].length; j++) {
				//datosPedidos[i][j]=teclado.nextInt();
				Arrays.fill(datosPedidos[i],0);
			//}
		}
		
		mostrarArrayBidimensional(datosPedidos);
		//teclado.close();
		
	}
	private static void mostrarArrayBidimensional(int[][] arrayAMostrar)
	{
		for (int i = 0; i < arrayAMostrar.length; i++) {
			for (int j = 0; j < arrayAMostrar[i].length; j++) {
				System.out.print(" "+arrayAMostrar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
