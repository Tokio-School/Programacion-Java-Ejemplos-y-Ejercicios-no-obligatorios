package ejem05_productor_consumidor;

public class Proceso extends Thread {

	MiPalabra palabra;
	public Proceso(MiPalabra palabra2) {
		palabra = palabra2;
	}

	public void asignarPalabra(MiPalabra palabra) {
        this.palabra = palabra;
    }
	
	public void run() {
		
		/*try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
		synchronized (palabra) {
			try {
				palabra.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(palabra);
	}
}
