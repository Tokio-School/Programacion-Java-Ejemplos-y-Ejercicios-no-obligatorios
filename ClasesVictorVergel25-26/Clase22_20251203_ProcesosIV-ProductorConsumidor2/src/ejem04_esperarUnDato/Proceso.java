package ejem04_esperarUnDato;

public class Proceso extends Thread {
	private String dato;
	
	public void run() {
		// Simular la obtención de un dato que tarda en llegar
		try {
			Thread.sleep(2000); // Simula tiempo de espera
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dato = "Fichero descargado";
		
	}
	
	public String getDato() {
		return dato;
	}

}
