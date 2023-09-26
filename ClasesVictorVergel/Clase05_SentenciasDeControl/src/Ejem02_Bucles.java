import java.util.Iterator;

public class Ejem02_Bucles {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++) {
			//System.out.println("* * * * *");
			for (int j = 1; j <= 5; j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
		    // Imprimir espacios en blanco a la izquierda
		    for (int j = 1; j <= 5 - i; j++) {
		        System.out.print(" ");
		    }
		    // Imprimir asteriscos para esta fila
		    for (int k = 1; k <= i * 2 - 1; k++) {
		        System.out.print("*");
		    }
		    // Cambiar de línea para la siguiente fila
		    System.out.println();
		}

	}

}
