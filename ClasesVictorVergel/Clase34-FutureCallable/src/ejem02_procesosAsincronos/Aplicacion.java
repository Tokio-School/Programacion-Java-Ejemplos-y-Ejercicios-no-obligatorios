package ejem02_procesosAsincronos;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ProcesoCallable> procesos=new ArrayList<ProcesoCallable>();
		for(int i=0;i<10;i++)
			procesos.add( new ProcesoCallable());
		
		//ProcesoRunnable runnable=new ProcesoRunnable();
		
		ExecutorService executor=Executors.newFixedThreadPool(10);
		ArrayList<Future<Integer>> resultados=new ArrayList<Future<Integer>>();
		/*for(int i=0;i<10;i++)
			resultados.add(executor.submit(procesos.get(i)));*/
		try {
			resultados=(ArrayList<Future<Integer>>) executor.invokeAll(procesos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Future<Integer> futuro=(Future<Integer>) executor.submit(runnable);
		

		System.out.println("Proceso lanzado");
		try {
			for(int i=0;i<10;i++)
				System.out.println(resultados.get(i).get());
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
