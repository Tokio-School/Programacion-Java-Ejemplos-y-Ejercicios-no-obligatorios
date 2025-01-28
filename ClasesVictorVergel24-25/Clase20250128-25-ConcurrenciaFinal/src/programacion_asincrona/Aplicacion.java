package programacion_asincrona;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aplicacion {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		ProcesoCallable proceso = new ProcesoCallable();
		Future<Integer> future = executor.submit(proceso);
		System.out.println("Proceso lanzado y esperando al resultado");
		try {
			System.out.println("Resultado de la ejecución:"+ future.get());
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
