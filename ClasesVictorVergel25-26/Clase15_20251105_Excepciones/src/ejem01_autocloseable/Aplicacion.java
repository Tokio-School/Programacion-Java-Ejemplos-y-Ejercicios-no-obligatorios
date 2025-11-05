package ejem01_autocloseable;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in);) {
			boolean error = false;
			do {
				try {
					System.out.println("Introduce un número entero: ");
					int numero = Integer.valueOf(scanner.nextLine());
				
					System.out.println("Resultado de la  división: " + 10/numero);
					System.out.println("Fin del programa");
					error = false;
				}
				catch (ArithmeticException excepcion) {
					// TODO Auto-generated catch block
					error = true;
					System.out.println("Error: No se puede dividir entre cero. Inténtalo de nuevo.");
					//excepcion.printStackTrace();
				}
				catch (NumberFormatException excepcion) {
					// TODO Auto-generated catch block
					error = true;
					System.out.println("Error: Entrada no válida. Por favor, introduce un número entero.");
					//excepcion.printStackTrace();
				}
			}while (error);
			System.out.println("*********************");
			//scanner.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try (MiRecurso recurso=new MiRecurso();){
			System.out.println("Usando el recurso");
			//recurso.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
