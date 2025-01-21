package ejem00_join;

public class Proceso extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 5000000; i++) {
			System.out.println("Proceso: " + i);
			
		}
		
		
		
	}

	
	
	
}
