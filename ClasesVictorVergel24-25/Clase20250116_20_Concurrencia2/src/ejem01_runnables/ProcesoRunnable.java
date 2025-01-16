package ejem01_runnables;

public class ProcesoRunnable implements Runnable{

	private Thread hilo;
	

	public ProcesoRunnable() {
        // TODO Auto-generated constructor stub
		hilo=new Thread(this);
		hilo.start();
	}

	@Override
	public void run() {

		int i=0;
		while(i<100000000)	
		{
			System.out.println("Proceso hijo->"+i);
			i++;
		}
	}

	
	
	
}
