package ejem01_procesos_thread;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el hilo principal");
		Proceso p = new Proceso();
		p.start();
		
		System.out.println("Soy el hilo principal");
	}

}
