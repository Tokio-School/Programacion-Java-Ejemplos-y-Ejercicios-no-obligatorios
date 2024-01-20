package ejem04_productor_consumidor_APIJjava;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;

public class Productor extends Thread {

	SynchronousQueue<Integer> datoCompartido;
	
	
	public Productor(SynchronousQueue<Integer>  dato) {
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		Random aleatorio=new Random();
		
		
		for (int i=0;i<10;i++)
		{
			try {
				datoCompartido.put(aleatorio.nextInt(0, 10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
		
		
	}
	
	

}
