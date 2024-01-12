package ejem01_matandoprocesos;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup procesos=new ThreadGroup("grupo procesos");
		Proceso p=new Proceso(procesos,"p1");
		p.start();
		Proceso p2=new Proceso(procesos,"p2");
		p2.start();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("El proceso principal va a finalizar");
		procesos.interrupt();
		
	}

}
