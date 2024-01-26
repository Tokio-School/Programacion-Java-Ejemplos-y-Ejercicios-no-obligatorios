package ejem00_productor_consumidor_APIJjava;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;


public class Productor extends Thread {

	ArrayBlockingQueue<Integer> datoCompartido;
	
	
	public Productor(ArrayBlockingQueue<Integer> dato) {
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		Random aleatorio=new Random();
		
		
		for (int i=0;i<20;i++)
		{
			int numTemporal=aleatorio.nextInt(0, 10);
			
			try {
				
				datoCompartido.put(numTemporal);
				System.out.println("Productor pone el : "+numTemporal);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
		
		
	}
	
	

}
