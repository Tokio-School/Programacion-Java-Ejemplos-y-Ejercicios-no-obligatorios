package productor_consumidor03_arrayblockingQueu;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Consumidor extends Thread {

	private ArrayBlockingQueue<String> buffer; 
	
	public Consumidor(ArrayBlockingQueue<String> buffer2) {
		this.buffer=buffer2;
	}

	@Override
	public void run() {
		super.run();

		for (int i = 0; i < 20; i++) {
			try {
				System.out.println("Consumidor:"+buffer.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	
}
