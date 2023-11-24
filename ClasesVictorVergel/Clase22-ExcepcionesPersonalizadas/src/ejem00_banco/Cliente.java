package ejem00_banco;

public class Cliente {
	private String nombre;
	private String dni;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Cliente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
	}
	

}
