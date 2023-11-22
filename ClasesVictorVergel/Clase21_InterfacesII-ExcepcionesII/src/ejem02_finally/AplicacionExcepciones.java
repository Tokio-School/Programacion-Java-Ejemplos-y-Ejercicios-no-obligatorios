package ejem02_finally;


import java.util.Scanner;

public class AplicacionExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner teclado=new Scanner(System.in);
		int numero=0;
		boolean insercionCorrecta=true;
		int contador=0;
		do {
			
			try {
				numero=teclado.nextInt();
				
				teclado.nextLine();
				insercionCorrecta=true;
			} 
			 catch (Exception e1) {
					// TODO Auto-generated catch block
				teclado.nextLine();
				System.out.println("Ha dado error porque no me has insertado un número. Vuelve a intentarlo");
				insercionCorrecta=false;
			}
			finally {
				contador++;
			}
		} while (!insercionCorrecta);
		System.out.println(numero);
		if (contador>3)
			System.out.println("Por favor, presta más atención.");
		System.out.println("Ha dado éste número de vueltas el bucle:"+contador);
		//teclado.close();
		

	}

}
