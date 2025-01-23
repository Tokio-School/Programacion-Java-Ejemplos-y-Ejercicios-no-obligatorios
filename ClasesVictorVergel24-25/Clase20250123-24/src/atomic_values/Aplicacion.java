package atomic_values;

import java.util.concurrent.atomic.AtomicInteger;

public class Aplicacion {

	public static void main(String[] args) {

		//ContadorCompartido contador = new ContadorCompartido();
		AtomicInteger contador = new AtomicInteger();
		
		Proceso p1 = new Proceso("proceso 1",contador);
		p1.start();
		
		Proceso p2 = new Proceso("proceso 2",contador);
		p2.start();

	}
	


}
