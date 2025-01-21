package ejem01_interrupt;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proceso p1 = new Proceso();
		p1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Proceso principal termina");
		p1.interrupt();
		
		
	}

}
