package ejem02_productor_consumidor;

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
	
	
}
