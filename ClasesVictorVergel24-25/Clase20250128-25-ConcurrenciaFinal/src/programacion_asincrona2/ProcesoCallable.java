package programacion_asincrona2;

import java.util.concurrent.Callable;

public class ProcesoCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		int contador=0;
		for (int i = 0; i < 10000; i++) {
			contador++;
		}
		Thread.sleep(5000);
		
		return contador;
	}

}
