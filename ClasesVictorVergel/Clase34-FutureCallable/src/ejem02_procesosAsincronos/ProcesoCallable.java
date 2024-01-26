package ejem02_procesosAsincronos;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcesoCallable implements Callable<Integer> {

	//public static int numero=0;
	public static AtomicInteger numero=new AtomicInteger(0);
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		//Thread.sleep(5000);
		
		return numero.getAndIncrement();
	}
	

}
