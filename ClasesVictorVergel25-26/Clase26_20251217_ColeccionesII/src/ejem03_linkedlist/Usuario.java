package ejem03_linkedlist;

public class Usuario {
	private String nombre;
	private String email;

	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + "]";
	}

}
