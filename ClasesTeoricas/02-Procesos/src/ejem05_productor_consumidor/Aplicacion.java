package ejem05_productor_consumidor;

import java.util.Scanner;

public class Aplicacion {
	public static void main(String[] args) {
		MiPalabra palabra=new MiPalabra();
		Proceso p = new Proceso(palabra);
		p.start();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		palabra.setPalabra(sc.nextLine());
		//p.asignarPalabra(palabra);
		
		synchronized (palabra) {
			palabra.notify();
		}
		
	}
}
