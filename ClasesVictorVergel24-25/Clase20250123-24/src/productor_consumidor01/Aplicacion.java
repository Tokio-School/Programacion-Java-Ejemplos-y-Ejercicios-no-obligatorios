package productor_consumidor01;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiBuffer buffer=new MiBuffer();
		Consumidor consumidor=new Consumidor(buffer);
		consumidor.start();
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Inserte un dato que mostrará el consumidor");
		String dato=teclado.nextLine();
		buffer.setDato(dato);
		synchronized (buffer) {
			buffer.notify();
		}
		
		
		
	}

}
