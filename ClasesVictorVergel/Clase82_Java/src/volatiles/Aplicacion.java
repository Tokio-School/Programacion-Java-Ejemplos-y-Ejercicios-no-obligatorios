package volatiles;

public class Aplicacion {

	private static volatile boolean flag = false;

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			while (!flag) {
				// Espera hasta que flag se convierta en true
			}
			System.out.println("Flag is true!");
		});

		Thread thread2 = new Thread(() -> {
			try {
				Thread.sleep(1000); // Espera un segundo
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			flag = true; // Cambia el valor de flag
			System.out.println("Flag set to true");
		});

		thread1.start();
		thread2.start();
	}

}
