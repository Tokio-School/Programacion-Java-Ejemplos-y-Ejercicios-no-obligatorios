import java.util.Scanner;

public class AplicacionBanderas {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número 1: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Introduce un número 2: ");
		int numero2=teclado.nextInt();
		
		boolean salir=false;
		int i=0;
		do {
			
			System.out.println("El número es: " + i);
			if (i==numero1) {
                System.out.println("BANDERA 1");
                salir=true;
            }
			i++;
		}while(!salir);
		
		
		
		int numPares=0;
		boolean salirPares=false;
		i=numero1;
		do {
			if (i % 2 == 0) {
				System.out.println("El número es par: " + i);
				numPares++;
				if (numPares == 2) {
					salirPares = true;
					//break;
				}
			}
			i++;
		}while (i<=numero2 && !salirPares);
		
		System.out.println("Fin del programa");
		
	}

}
