package ejem00_vector;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumidor extends Thread {
	Vector vector;
	AtomicInteger numero;
	
	
	public Consumidor(Vector vector, AtomicInteger numero, String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.vector=vector;
		this.numero=numero;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Consumidor:"+ vector.get(0));
		}
	}

	
}
