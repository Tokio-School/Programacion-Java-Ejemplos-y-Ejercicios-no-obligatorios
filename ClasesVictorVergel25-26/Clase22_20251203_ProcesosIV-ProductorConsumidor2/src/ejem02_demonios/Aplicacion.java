package ejem02_demonios;

public class Aplicacion {
	public static void main(String[] args) {
		Proceso proceso1 = new Proceso("proceso demonio");
		proceso1.setDaemon(true); // Establece el hilo como demonio
		proceso1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Proceso principal finalizado.");
	}
}
