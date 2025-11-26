package ejem01_runnable;

public class Aplicacion {

	public static void main(String[] args) {
		
		/*Runnable miProceso=new Runnable( ) {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};*/

		Runnable miProceso2=() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Proceso HIJO en ejecución "+i);
				Thread.yield();
				/*try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			
			}
		};
		
		Thread hijo=new Thread(miProceso2);
		hijo.start();
		
		try {
			hijo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Proceso PADRE en ejecución "+i);
			Thread.yield();
			
			/*try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
					

	}

}
