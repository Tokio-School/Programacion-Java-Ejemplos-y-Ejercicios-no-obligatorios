package ejem02_interrupt;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {

		Thread procesoHijo = new Thread(() -> {
			for (int i = 0; (i < 1000 && !Thread.currentThread().isInterrupted()) ; i++) {
				System.out.println("Proceso HIJO en ejecución " + i);
				try  {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Liberando recursos.......");
					Thread.currentThread().interrupt(); // Volver a poner el estado de interrupción
				}
				
			}
		});
		procesoHijo.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		procesoHijo.interrupt();
		 

	}

}
