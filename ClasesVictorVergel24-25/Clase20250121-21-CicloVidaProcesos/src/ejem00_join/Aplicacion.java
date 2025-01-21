package ejem00_join;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proceso p1 = new Proceso();
		p1.setDaemon(true);
		p1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Proceso principal termina");
		
		
		
	}

}
