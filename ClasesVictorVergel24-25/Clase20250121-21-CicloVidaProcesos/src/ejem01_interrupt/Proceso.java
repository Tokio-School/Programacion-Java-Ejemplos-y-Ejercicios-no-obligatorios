package ejem01_interrupt;

public class Proceso extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; (i < 5000000 && !Thread.currentThread().isInterrupted())   ; i++) {
			System.out.println("Proceso: " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				//if (e instanceof InterruptedException)
                    Thread.currentThread().interrupt();
			}
		}
		if (Thread.currentThread().isInterrupted())
			System.out.println("Liberando recursos.....");
		
	}

	
	
	
}
