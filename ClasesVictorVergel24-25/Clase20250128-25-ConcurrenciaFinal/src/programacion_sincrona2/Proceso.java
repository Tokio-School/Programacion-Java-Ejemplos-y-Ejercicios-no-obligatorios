package programacion_sincrona2;

public class Proceso extends Thread {

	private Contador contador;
	
	public Proceso(Contador contador) {
		this.contador = contador;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		for (int i = 0; i < 10000; i++) {
			contador.setContador(contador.getContador()+1);
		}
		synchronized (contador) {
			contador.notify();
		}
	}

	public int getContador() {
		return contador.getContador();
	}
	
	

}
