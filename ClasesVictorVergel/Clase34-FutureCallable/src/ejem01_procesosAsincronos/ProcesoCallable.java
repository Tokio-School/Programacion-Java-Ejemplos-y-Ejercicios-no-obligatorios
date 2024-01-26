package ejem01_procesosAsincronos;

import java.util.concurrent.Callable;

public class ProcesoCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		//Thread.sleep(5000);
		
		return 33;
	}
	

}
