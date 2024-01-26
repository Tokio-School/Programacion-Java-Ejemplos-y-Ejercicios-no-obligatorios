package ejem00_productor_consumidor_APIJjava;

import java.util.concurrent.ArrayBlockingQueue;


public class Consumidor extends Thread {

	ArrayBlockingQueue<Integer> datoCompartido;
	
	public Consumidor(ArrayBlockingQueue<Integer> dato, String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		for (int i=0;i<20;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+": Numero aleatorio generado: "+ datoCompartido.take());
				//Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

}
