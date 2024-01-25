package ejemplo_produc_consumi_agua;

public class Agua {

	private boolean gota=false;
	
	public synchronized void ponerGota() {
		// TODO Auto-generated method stub
		if (gota)
			try {
				System.out.println("se duerme el productor");
				
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		else
		{
			gota=true;
			notify();
		}
	}

	public synchronized boolean cogiendoGota() {
		// TODO Auto-generated method stub
		
		/*try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Thread.currentThread().interrupt();
		}*/
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
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			return false;
		}
	}
	
	

}
