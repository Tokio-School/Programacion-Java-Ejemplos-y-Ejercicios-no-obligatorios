import java.io.Serializable;

public class Mensaje implements Serializable{
	
	private String nombre_cliente;
	private String mensaje;
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Mensaje(String nombre_cliente, String mensaje) {
		super();
		this.nombre_cliente = nombre_cliente;
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "Mensaje [nombre_cliente=" + nombre_cliente + ", mensaje=" + mensaje + "]";
	}
	
}
