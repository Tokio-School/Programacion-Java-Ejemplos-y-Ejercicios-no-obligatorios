package ejem01_productor_consumidor_banderas;

public class Consumidor extends Thread {

	Dato dato;
	public Consumidor(Dato dato,String nombre) {
		super(nombre);
		this.dato = dato;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while(!dato.coger().equalsIgnoreCase("fin")) {
			System.out.println(Thread.currentThread().getName()+" - "+dato.getMensaje());
		}
		/*synchronized (dato) {
			try {
				dato.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
			
		//System.out.println("consumidor:"+dato.getMensaje());
		
	}
	
	
	
	

}
