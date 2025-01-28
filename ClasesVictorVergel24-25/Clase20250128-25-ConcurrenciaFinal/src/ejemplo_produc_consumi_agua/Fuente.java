package ejemplo_produc_consumi_agua;

import java.util.Random;

public class Fuente extends Thread {

	private Agua agua;
	
	public Fuente(Agua agua) {
		// TODO Auto-generated constructor stub
		this.agua=agua;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		Random aleatorio=new Random();
		while(!isInterrupted())
		{
			
			try {
				Thread.sleep(aleatorio.nextInt(1, 10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			
			agua.ponerGota();
		}
		
		
		
	}

	
}
