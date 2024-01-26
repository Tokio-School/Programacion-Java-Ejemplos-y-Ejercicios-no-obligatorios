package ejem01_procesosAsincronos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcesoCallable callable=new ProcesoCallable();
		//ProcesoRunnable runnable=new ProcesoRunnable();
		
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Future<Integer> futuro=executor.submit(callable);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Proceso lanzado");
		try {
			System.out.println(futuro.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Proceso finalizado");
		
		executor.shutdown();
	}

}
