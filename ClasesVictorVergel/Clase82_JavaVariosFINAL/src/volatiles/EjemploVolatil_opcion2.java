package volatiles;

import java.util.concurrent.atomic.AtomicBoolean;

public class EjemploVolatil_opcion2 {

	public static AtomicBoolean flag = new AtomicBoolean(false);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!flag.get()) {
					i++;
				}
				System.out.println("Fin del hilo 1");
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					flag.set(true);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Fin del hilo 2");
			}
		});
		t2.start();
		
		
	}

}
