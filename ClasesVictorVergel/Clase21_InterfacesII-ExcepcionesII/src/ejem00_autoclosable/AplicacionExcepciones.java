package ejem00_autoclosable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicacionExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*try {
			System.out.println(3/0);
			System.out.println("Hola excepciones");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			((ArithmeticException)e).printStackTrace();
			System.err.println("Se ha producido un error");
		}*/
		
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		boolean insercionCorrecta=true;
		do {
			
			try (teclado;Recurso rec=new Recurso();){
				numero=teclado.nextInt();
				
				teclado.nextLine();
				insercionCorrecta=true;
			} /*catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				teclado.nextLine();
				System.out.println("Ha dado error porque no me has insertado un número. Vuelve a intentarlo");
				insercionCorrecta=false;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} */
			 catch (Exception e1) {
					// TODO Auto-generated catch block
				teclado.nextLine();
				System.out.println("Ha dado error porque no me has insertado un número. Vuelve a intentarlo");
				insercionCorrecta=false;
			}	
		} while (!insercionCorrecta);
		System.out.println(numero);
		//teclado.close();
		

	}

}
