package ejem02_predicados;

public class Usuario {
	private int id;
	private String nombre;
	
	public Usuario(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
