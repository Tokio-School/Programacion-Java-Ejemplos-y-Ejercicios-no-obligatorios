package ejem04_productor_consumidor_APIJjava;

import java.util.concurrent.SynchronousQueue;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Numero dato=new Numero();
		
		SynchronousQueue<Integer> listaSincronizada=new SynchronousQueue<Integer>();
		
		Productor productor=new Productor(listaSincronizada);
		Consumidor consumidor=new Consumidor(listaSincronizada,"Consumidor 1");

		
		productor.start();
		consumidor.start();

		
		
	}

}
