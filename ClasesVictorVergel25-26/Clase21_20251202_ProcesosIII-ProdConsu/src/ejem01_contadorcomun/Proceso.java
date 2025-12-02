package ejem01_contadorcomun;

import java.util.concurrent.atomic.AtomicInteger;

public class Proceso extends Thread {
	private AtomicInteger contador;
	
	public Proceso(String name, AtomicInteger contador) {
		super(name);
		this.contador = contador;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=0;contador.get()<10000;i++)
		{
			
			/*synchronized (contador) {
				if (contador.getNumero()<10000) {*/
					System.out.println("Proceso hijo "+this.getName()+": "+contador.getAndIncrement());
					
					/*int temp=contador.getNumero();
					
					temp++;
					
					contador.setNumero(temp);
				}
			}*/
		}
	}
}
