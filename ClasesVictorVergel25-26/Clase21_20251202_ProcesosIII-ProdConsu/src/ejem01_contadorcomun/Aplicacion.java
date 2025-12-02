package ejem01_contadorcomun;

import java.util.concurrent.atomic.AtomicInteger;

public class Aplicacion {

	public static void main(String[] args) {
		//Contador contador = new Contador();
		AtomicInteger contador=	 new AtomicInteger(0);
		
		
		
		Proceso p = new Proceso("Proceso 1",contador);
		Proceso p2 = new Proceso("Proceso 2",contador);
		Proceso p3 = new Proceso("Proceso 3",contador);
		Proceso p4 = new Proceso("Proceso 4",contador);
		//p.run();
		p.start();
		p2.start();
		p3.start();
		p4.start();
		/*for(int i=0;i<1000000;i++)
		{
			System.out.println("Proceso padre:"+i);
		}*/

	}

}

