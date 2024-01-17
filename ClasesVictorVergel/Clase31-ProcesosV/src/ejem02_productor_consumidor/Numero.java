package ejem02_productor_consumidor;

public class Numero {
	private int numero;

	public synchronized int getNumero() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero;
	}

	public synchronized void setNumero(int numero) {
		this.numero = numero;
		notify();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
