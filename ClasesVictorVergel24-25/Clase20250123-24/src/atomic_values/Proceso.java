package atomic_values;

import java.util.concurrent.atomic.AtomicInteger;

public class Proceso extends Thread{
	
	private AtomicInteger contadorCompartido; 
	
	public Proceso() {
		super();
	}
	
	public Proceso(String nombre, AtomicInteger contador) {
		super(nombre);
		contadorCompartido=contador;
	}
	

	private int contadorInterno = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			contadorInterno++;
			/*synchronized (contadorCompartido) {
				int aux=contadorCompartido.getContador();
				aux++;
				contadorCompartido.setContador(aux);*/
				System.out.println(getName() + " - " + 
				      contadorInterno + " contador compartido: " + 
					  contadorCompartido.getAndIncrement());
			//}
			
		}

		
	}

	
	
	
	
}
