package ejemplo_produc_consumi_agua;

public class Agua {

	private boolean gota=false;
	
	public synchronized void ponerGota() {
		
		if (gota)
			try {
				System.out.println("se duerme el productor");
				
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		else
		{
			gota=true;
			notify();
		}
	}

	public synchronized boolean cogiendoGota() {
		
		if (gota)
		{
			gota=false; //Abro el grifo y digo al productor que vuelva a generar gota.
			notifyAll();
			
			return true; //Cogida la gota
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			return false;
		}
	}
	
	

}
