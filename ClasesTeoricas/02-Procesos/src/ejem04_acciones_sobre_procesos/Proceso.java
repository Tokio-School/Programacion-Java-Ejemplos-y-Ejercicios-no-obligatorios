package ejem04_acciones_sobre_procesos;

public class Proceso extends Thread {
	
	private Contador c;

	public Proceso(String nombre, Contador c) {
		super(nombre);
		this.c = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//System.out.println(Thread.currentThread().getName() + " - " + i);
			Thread.yield();
			synchronized (c) {
				System.out.println(this.getName() + " - " + i+ " contador comun: "+c.getCont());
				int cont = c.getCont();
				cont=cont+1;
				c.setCont(cont);	
			}
			
			
		}
	}
}
