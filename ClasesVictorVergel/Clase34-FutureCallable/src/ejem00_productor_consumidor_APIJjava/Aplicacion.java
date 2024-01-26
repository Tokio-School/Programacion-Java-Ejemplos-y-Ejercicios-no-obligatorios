package ejem00_productor_consumidor_APIJjava;

import java.util.concurrent.ArrayBlockingQueue;


public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayBlockingQueue<Integer> listaSincronizada=new ArrayBlockingQueue<Integer>(5);
		
		Productor productor=new Productor(listaSincronizada);
		Consumidor consumidor=new Consumidor(listaSincronizada,"Consumidor 1");

		
		productor.start();
		consumidor.start();

		
		
	}

}
