package productor_consumidor03_arrayblockingQueu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MiBuffer buffer=new MiBuffer();
		ArrayBlockingQueue<String> buffer=new ArrayBlockingQueue<String>(50);
		
		
		
		Consumidor consumidor=new Consumidor(buffer);
		consumidor.start();
		
		Productor productor=new Productor("Productor1",buffer);
		productor.start();
		

		Productor productor2=new Productor("Productor2",buffer);
		productor2.start();
		
		
		
	}

}
