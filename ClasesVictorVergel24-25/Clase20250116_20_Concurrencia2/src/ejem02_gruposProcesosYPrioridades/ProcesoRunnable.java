package ejem02_gruposProcesosYPrioridades;

import java.util.Iterator;

public class ProcesoRunnable implements Runnable{

	private Thread hilo;
	

	public ProcesoRunnable(String nombreProceso, ThreadGroup grupoProcesos) {
        // TODO Auto-generated constructor stub
		hilo=new Thread(grupoProcesos,this,nombreProceso);
		if (hilo.getName().equals("proceso1")) {
			hilo.setPriority(Thread.MAX_PRIORITY);
		} else {
			hilo.setPriority(Thread.MIN_PRIORITY);
		}
		hilo.start();
	}

	@Override
	public void run() {

		/*int i=0;
		while(i<100000000)	
		{
			System.out.println(hilo.getName()+" -> "+i+" y soy del grupo de procesos: "+Thread.currentThread().getThreadGroup().getName());
			i++;
		}*/
		
		if (!Thread.currentThread().getName().equals("proceso1")) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			Thread listadoHermanosProcesos[]=new Thread[Thread.currentThread().getThreadGroup().activeCount()];
			Thread.currentThread().getThreadGroup().enumerate(listadoHermanosProcesos);
			for (int i = 0; i < listadoHermanosProcesos.length; i++) {
				System.out.println("Hilo: " + listadoHermanosProcesos[i].getName());
			}
		}
		
		
	}

	
	
	
}
