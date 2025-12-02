package ejem02_productor_consumidor;

public class Consumidor extends Thread {

	Dato dato;
	public Consumidor(Dato dato) {
		this.dato = dato;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		synchronized (dato) {
			try {
				dato.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		System.out.println("consumidor:"+dato.getMensaje());
		
	}
	
	
	
	

}
