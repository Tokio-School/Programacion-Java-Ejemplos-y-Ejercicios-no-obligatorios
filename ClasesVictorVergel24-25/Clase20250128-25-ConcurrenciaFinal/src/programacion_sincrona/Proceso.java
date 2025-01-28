package programacion_sincrona;

public class Proceso extends Thread {

	private int contador=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		for (int i = 0; i < 10000; i++) {
			contador++;
		}
	}

	public int getContador() {
		return contador;
	}
	
	

}
