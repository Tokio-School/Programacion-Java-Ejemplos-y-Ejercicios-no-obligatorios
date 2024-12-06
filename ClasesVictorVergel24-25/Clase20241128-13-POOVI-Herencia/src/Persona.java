
public class Persona {
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	private String nombre;
	private String edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, String edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
}
