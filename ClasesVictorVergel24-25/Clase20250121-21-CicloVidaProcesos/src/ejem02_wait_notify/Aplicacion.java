package ejem02_wait_notify;

public class Aplicacion {
	public static void main(String[] args) {
		Contador c = new Contador();
		
		Thread p=new Thread(() ->{
			for (int i = 0; i < 10; i++) {
				synchronized (c) {
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
						int aux=c.getC();
						aux++;
						c.setC(aux);
						System.out.println("Proceso 1: "+c.getC());
						c.notify();
				}
				
			}
			System.out.println("Proceso 1 terminado");
		});
		p.start();
		
		
		Thread p2=new Thread(() ->{
			
			for (int i = 0; i < 10; i++) {
				synchronized (c) {
					int aux=c.getC();
					aux++;
					c.setC(aux);
					System.out.println("Proceso 2: "+c.getC());
					
					c.notify();
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				
			}
			System.out.println("Proceso 2 terminado");
		});
		p2.start();
		

		
		
		
		
		Thread p3=new Thread(() ->{
			
			for (int i = 0; i < 10; i++) {
				synchronized (c) {
					int aux=c.getC();
					aux++;
					c.setC(aux);
					System.out.println("Proceso 3: "+c.getC());
					
					c.notify();
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				
			}
			System.out.println("Proceso 3 terminado");
		});
		p3.start();

		/*boolean salir=false;
		do
		{
			if (!p.isAlive() && !p2.isAlive())
			{
				synchronized (c) {
					c.notify();
				}
				salir=true;
			}	
			// Habría que hacer lo mismo para las otras posibilidades
			

		}while(!salir);*/
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (c) {
			c.notifyAll();
		}
			
		
	}

}
