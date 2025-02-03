package ejem02_procesos_runnable;

public class Proceso implements Runnable {

	Thread p;
	
	public Proceso() {
		super();
		p=new Thread(this);
		p.start();

	}

	@Override
	public void run() {
		System.out.println("Soy un proceso");
	}

	
	
	
}
