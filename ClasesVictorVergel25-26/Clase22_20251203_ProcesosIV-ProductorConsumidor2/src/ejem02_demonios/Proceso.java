package ejem02_demonios;

public class Proceso extends Thread {
	public Proceso(String string) {
			super(string);
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Proceso en ejecución: " + Thread.currentThread().getName());
				Thread.sleep(1000); // Simula trabajo haciendo una pausa
			}
		} catch (InterruptedException e) {
			System.out.println("Proceso interrumpido: " + Thread.currentThread().getName());
		}
	}
}
