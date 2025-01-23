package productor_consumidor01;

public class Consumidor extends Thread {

	private MiBuffer buffer; 
	
	public Consumidor(MiBuffer buffer) {
		this.buffer=buffer;
	}

	@Override
	public void run() {
		super.run();
		synchronized(buffer){
			try {
				buffer.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumidor: "+buffer.getDato());
		
		
	}
	
}
