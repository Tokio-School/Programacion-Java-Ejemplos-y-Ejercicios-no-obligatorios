package productor_consumidor02;

import java.util.ArrayList;

public class Consumidor extends Thread {

	private MiBuffer buffer; 
	
	public Consumidor(MiBuffer buffer2) {
		this.buffer=buffer2;
	}

	@Override
	public void run() {
		super.run();

		for (int i = 0; i < 20; i++) {
			System.out.println("Consumidor:"+buffer.cogerDato());
		}

	}
	
	
	
}
