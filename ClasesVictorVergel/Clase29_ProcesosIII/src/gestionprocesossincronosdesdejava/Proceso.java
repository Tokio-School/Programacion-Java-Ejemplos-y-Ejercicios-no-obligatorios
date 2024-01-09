package gestionprocesossincronosdesdejava;

import java.util.concurrent.atomic.AtomicInteger;

public class Proceso extends Thread {

	AtomicInteger contadorComun;
	int contadorParticular=0;
	public Proceso(ThreadGroup grupoPrioritario, AtomicInteger contadorComun, String name) {
		// TODO Auto-generated constructor stub
		super(grupoPrioritario, name);
		this.contadorComun=contadorComun;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		int numeroProcesosActivos=Thread.currentThread().getThreadGroup().activeCount();
		System.out.println("Proceso: "+getName()+numeroProcesosActivos);
		
		Thread procesosGrupo[]=new Thread[numeroProcesosActivos]; 
		Thread.currentThread().getThreadGroup().enumerate(procesosGrupo);
		
		for (Thread thread : procesosGrupo) {
			System.out.println(getName()+"->"+thread.getName());
		}
		
		
		do 
		{
			System.out.println(Thread.currentThread().getThreadGroup().getName()+"-> Proceso: "+getName()+" - "+ contadorComun.getAndIncrement());
			contadorParticular++;
		}while (contadorComun.get()<36000);

		System.out.println("Proceso: "+getName()+" ha contado "+contadorParticular);
	}

	
}
