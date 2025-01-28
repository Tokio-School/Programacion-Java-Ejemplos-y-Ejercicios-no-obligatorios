package programacion_asincrona2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aplicacion {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		
		ArrayList<ProcesoCallable> procesos = new ArrayList<ProcesoCallable>();
		for (int i = 0; i < 10; i++) {
			procesos.add(new ProcesoCallable());
		}
		
		try {
			
			ArrayList<Future<Integer>> futures = (ArrayList<Future<Integer>>) executor.invokeAll(procesos);
			System.out.println("Proceso lanzado y esperando al resultado");
			
			for (Future<Integer> future : futures) {
				System.out.println("Resultado: " + future.get());
			}
			System.out.println("Recuperados todos los valores ");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		executor.shutdown();
		System.out.println("Finalizando Aplicacion y cerrando el ExecutorService");

	}

}
