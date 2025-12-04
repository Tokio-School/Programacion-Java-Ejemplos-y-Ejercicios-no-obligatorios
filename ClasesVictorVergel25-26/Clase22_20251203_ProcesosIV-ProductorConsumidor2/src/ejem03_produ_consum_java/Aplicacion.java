package ejem03_produ_consum_java;

import java.util.concurrent.ArrayBlockingQueue;

public class Aplicacion {
	public static void main(String[] args) {
		ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(5);
		
		Thread productor = new Thread(() -> {
			try {
				for (int i = 0; i < 50; i++)
					buffer.put("Elemento"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "Productor");
		productor.start();
		
		Runnable consumidorRunnable= () -> {
			try {
				for (int i = 0; i < 50; i++)
				{
					String elemento = buffer.take();
					System.out.println(Thread.currentThread().getName()+": "+ elemento+" Capacidad del buffer: "+buffer.size());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		for (int i = 0; i < 5; i++)
		{
			Thread consumidor = new Thread(consumidorRunnable, "Consumidor"+i);
		
			consumidor.start();
		}
	}
}
