package ejem00_iniciandoObjetos;

public class Persona {
	private String nombre;

	/**
	 * @param nombre
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;

	}
	public Persona() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(((Persona)obj).nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNombre(String nombre, String apellido) {
		this.nombre = nombre+" "+apellido;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
	
	
}
