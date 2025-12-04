package ejem01_productor_consumidor_banderas;

public class Dato {
	private String mensaje;
	private boolean primeroCogerDato=true;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Dato [mensaje=" + mensaje + "]";
	}
	
	public synchronized void poner(String mensaje) {
		this.mensaje = mensaje;
		primeroCogerDato=true;
		/*if (mensaje.equalsIgnoreCase("fin")) {
			System.out.println("Notificando a todos los consumidores para finalizar...");
			this.notifyAll();
		}
		else this.notify();*/
		this.notifyAll();
	}
	public synchronized String coger() {
		do {
			try {
				this.wait();
				System.out.println("Notificado a "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(this.mensaje!="fin" && !primeroCogerDato);
		if (this.mensaje!="fin") 
			primeroCogerDato=false;
		else
			primeroCogerDato=true;
		//System.out.println("--------------------------"+mensaje);
		return mensaje;
	}
	
}
