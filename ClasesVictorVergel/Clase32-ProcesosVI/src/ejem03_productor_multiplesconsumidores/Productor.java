package ejem03_productor_multiplesconsumidores;

import java.util.Random;

public class Productor extends Thread {

	Numero datoCompartido;
	public Productor(Numero dato) {
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		Random aleatorio=new Random();
		
		
		for (int i=0;i<10;i++)
		{
			datoCompartido.setNumero(aleatorio.nextInt(0, 10));
	
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (datoCompartido) {
			datoCompartido.setFin(true);
			datoCompartido.notifyAll();
		}
		
	}
	
	

}
