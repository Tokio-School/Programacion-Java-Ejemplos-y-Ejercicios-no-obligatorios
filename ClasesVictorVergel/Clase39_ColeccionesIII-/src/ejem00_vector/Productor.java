package ejem00_vector;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Productor extends Thread {
	Vector<Integer> vector;
	AtomicInteger numero;
	
	public Productor(Vector<Integer> vector, AtomicInteger numero) {
		// TODO Auto-generated constructor stub
		this.vector=vector;
		this.numero=numero;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		for (int i = 0; i < 20; i++) {
			int temporal=numero.getAndIncrement();
			vector.add(temporal);
			
			System.out.println("Productor:"+ temporal+" tamaño del Vector:" + vector.size());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
