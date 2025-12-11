package ejemplo01_pool;

import java.util.concurrent.Callable;

public class ProcesoDevolucionDato implements Callable<String> {

	@Override
	public String call() throws Exception {

		for (int i = 0; i < 5; i++) {
			System.out.println("ProcesoDevolucionDato - Iteracion " + i);
			Thread.sleep(500);
		}
		return "FIN";
	}

}
