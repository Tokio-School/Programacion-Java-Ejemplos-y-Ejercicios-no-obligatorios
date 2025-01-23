package productor_consumidor03_arrayblockingQueu;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Productor extends Thread {

	private ArrayBlockingQueue<String> buffer; 
	
	public Productor(String nombreProceso, ArrayBlockingQueue<String> buffer) {
		super(nombreProceso);
		this.buffer=buffer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				buffer.put(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
