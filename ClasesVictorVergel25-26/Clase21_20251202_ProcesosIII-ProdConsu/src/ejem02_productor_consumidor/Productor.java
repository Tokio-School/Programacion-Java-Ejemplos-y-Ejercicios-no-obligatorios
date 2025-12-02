package ejem02_productor_consumidor;

import java.util.Scanner;

public class Productor {

	public static void main(String[] args) {
		Dato dato = new Dato();
		Consumidor consumidor = new Consumidor(dato);
		consumidor.start();		
		
		Scanner sc = new Scanner(System.in);
		dato.setMensaje(sc.nextLine());
		synchronized (dato) {
			dato.notify();
		}
		
	}

}
