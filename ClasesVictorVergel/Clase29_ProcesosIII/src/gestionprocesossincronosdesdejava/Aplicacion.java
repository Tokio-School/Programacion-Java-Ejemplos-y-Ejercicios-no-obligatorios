package gestionprocesossincronosdesdejava;

import java.util.concurrent.atomic.AtomicInteger;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup grupoPrioritario=new ThreadGroup("Grupo prioritario");
		grupoPrioritario.setMaxPriority(Thread.MAX_PRIORITY);
		ThreadGroup grupoNoPrioritario=new ThreadGroup("Grupo NO prioritario");
		grupoNoPrioritario.setMaxPriority(Thread.MIN_PRIORITY);
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		
		AtomicInteger contadorComun=new AtomicInteger();
		Proceso p1=new Proceso(grupoPrioritario,contadorComun,"p1");
		//p1.setDaemon(true);
		p1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Proceso p2=new Proceso(grupoPrioritario,contadorComun,"p2");
		//p2.setDaemon(true);
		p2.start();
		try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Proceso p3=new Proceso(grupoNoPrioritario,contadorComun,"p3");
		//p3.setDaemon(true);
		p3.start();
		try {
			p3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Proceso p4=new Proceso(grupoNoPrioritario,contadorComun,"p4");
		//p4.setDaemon(false);
		p4.start();
		try {
			p4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
