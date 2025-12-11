package ejemplo03_gestorMultiple;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aplicacion {
	public static void main(String[] args)
	{
		ExecutorService gestorProcesos = Executors.newFixedThreadPool(10);
		//ExecutorService gestorProcesos = Executors.newSingleThreadExecutor();
		ArrayList<ProcesoDevolucionDato> listaProcesos = new ArrayList<ProcesoDevolucionDato>();
		for (int i = 0; i < 10; i++) {
			listaProcesos.add(new ProcesoDevolucionDato(i));
		}
		
		ArrayList<Future<String>> resultado=null;
		try {
			resultado = (ArrayList<Future<String>>) gestorProcesos.invokeAll(listaProcesos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			for (int i = 0; i < resultado.size(); i++) {
				System.out.println("Resultado de la ejecución callable "+i+":"+resultado.get(i).get());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gestorProcesos.shutdown();
		
	}
}
