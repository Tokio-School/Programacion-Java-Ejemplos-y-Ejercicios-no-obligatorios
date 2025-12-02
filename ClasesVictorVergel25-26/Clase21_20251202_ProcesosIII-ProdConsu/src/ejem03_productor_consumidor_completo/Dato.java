package ejem03_productor_consumidor_completo;

public class Dato {
	private String mensaje;

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
		if (mensaje.equalsIgnoreCase("fin")) {
			System.out.println("Notificando a todos los consumidores para finalizar...");
			this.notifyAll();
		}
		else this.notify();
	}
	public synchronized String coger() {
		try {
			this.wait();
			System.out.println("Notificado a "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("--------------------------"+mensaje);
		return mensaje;
	}
	
}
