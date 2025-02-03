package ejem04_acciones_sobre_procesos;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador c = new Contador(0);
		
		
		Proceso p1 = new Proceso("Proceso 1",c);
		Proceso p2 = new Proceso("Proceso 2",c);
		Proceso p3 = new Proceso("Proceso 3",c);
		Proceso p4 = new Proceso("Proceso 4",c);
		Proceso p5 = new Proceso("Proceso 5",c);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		//Thread.currentThread();
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Thread.yield();
		System.out.println("Proceso principal");
		
		
		
		
		
		
		
		
		
	}

}
