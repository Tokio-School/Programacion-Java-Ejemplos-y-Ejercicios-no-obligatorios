package productor_consumidor02;

import java.util.ArrayList;

public class Productor extends Thread {

	private MiBuffer buffer; 
	
	public Productor(String nombreProceso,MiBuffer buffer) {
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
			buffer.poner(Thread.currentThread().getName()+":"+i);
		}
		
		
	}
	
	

}
