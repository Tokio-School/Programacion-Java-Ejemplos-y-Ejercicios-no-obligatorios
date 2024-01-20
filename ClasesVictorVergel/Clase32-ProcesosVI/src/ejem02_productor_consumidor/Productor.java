package ejem02_productor_consumidor;

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
		synchronized (datoCompartido) {
			datoCompartido.notify();
		}
		
	}
	
	

}
