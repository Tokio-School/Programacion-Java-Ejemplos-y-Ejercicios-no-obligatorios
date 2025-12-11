package ejemplo01_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aplicacion {
	public static void main(String[] args)
	{
		//ExecutorService gestorProcesos = Executors.newFixedThreadPool(4);
		ExecutorService gestorProcesos = Executors.newSingleThreadExecutor();
		Future<String> resultado = gestorProcesos.submit(new ProcesoDevolucionDato());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Resultado de la ejecución callable:"+resultado.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		/*resultado = gestorProcesos.submit(new ProcesoDevolucionDato());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Resultado de la ejecución callable:"+resultado.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		
		
		
		
		
		gestorProcesos.shutdown();
		
	}
}
