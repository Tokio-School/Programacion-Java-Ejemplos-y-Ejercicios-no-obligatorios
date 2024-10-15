import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PruebaEstatica.x);
		System.out.println(PruebaEstatica.suma(5, 3));
		
		System.out.println(Math.abs(-5));
		
		for (int i = 1; i < 10; i++) {
			//System.out.println((int)(Math.random()*10));
			System.out.println(Math.round(Math.random()*10));
		}
		
		/*int num = 50;
	    switch ((1<=num && num<=5)?
	    		0:(6<=num && num<=10)?
	    		1:(11<=num && num<=15)?
	    		2:(16<=num && num<=20)?
	    	    3:(21<=num && num<=25)?{)*/
	
		Scanner teclado	= new Scanner(System.in);
		int num =0;
		do {
			System.out.println("Inserte el número: (0 para salir)");
			num = teclado.nextInt();
			int i = 0;
			while (i <= num) {
				System.out.println("El número es: " + i);
				i++;
			} 
		} while (num!=0);
		System.out.println("Fin del programa");
		
		
		
		
		
		
		
	}

}
