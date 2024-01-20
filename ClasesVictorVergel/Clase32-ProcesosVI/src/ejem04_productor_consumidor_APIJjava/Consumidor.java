package ejem04_productor_consumidor_APIJjava;

import java.util.concurrent.SynchronousQueue;

public class Consumidor extends Thread {

	SynchronousQueue<Integer> datoCompartido;
	
	public Consumidor(SynchronousQueue<Integer> dato, String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+": Numero aleatorio generado: "+ datoCompartido.poll());
		}
	
		
	}

}
