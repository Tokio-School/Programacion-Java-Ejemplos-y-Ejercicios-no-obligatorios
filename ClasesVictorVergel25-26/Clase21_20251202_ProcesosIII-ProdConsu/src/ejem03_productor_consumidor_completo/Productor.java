package ejem03_productor_consumidor_completo;

import java.util.Scanner;

public class Productor {

	public static void main(String[] args) {
		Dato dato = new Dato();
		Consumidor consumidor = new Consumidor(dato,"Consumidor 1");
		consumidor.start();
		Consumidor consumidor2 = new Consumidor(dato,"Consumidor 2");
		consumidor2.start();		
		Consumidor consumidor3 = new Consumidor(dato,"Consumidor 3");
		consumidor3.start();		
		Consumidor consumidor4 = new Consumidor(dato,"Consumidor 4");
		consumidor4.start();		
		
		Scanner sc = new Scanner(System.in);
		String cadena="";
		while(!cadena.equalsIgnoreCase("fin")) {
			//dato.setMensaje(sc.nextLine());
			System.out.println("Introduce cadenas de texto (fin para terminar):");
			cadena=sc.nextLine();
			dato.poner(cadena);
			
			/*synchronized (dato) {
				dato.notify();
			}*/
			
		}
	}

}
