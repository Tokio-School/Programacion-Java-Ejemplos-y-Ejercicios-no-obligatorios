package ejem01_matandoprocesos;

public class Proceso extends Thread {

	public Proceso(ThreadGroup procesos,String nombre) {
		// TODO Auto-generated constructor stub
		super(procesos,nombre);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		int variable=0;
		while(!isInterrupted()) {
			System.out.println("Proceso: "+Thread.currentThread().getName()+"->"+variable);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Liberando recursos.....");
				this.interrupt();
			}
			variable++;
		}
		
	}

}
