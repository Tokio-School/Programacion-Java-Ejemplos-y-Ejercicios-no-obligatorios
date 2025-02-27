package ejem02_colecciones;

public class Profesor  {
	private String nombre;
	private Integer dni;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	/**
	 * @param nombre
	 * @param dni
	 */
	public Profesor(String nombre, Integer dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", dni=" + dni + "]";
	}

		
	
	
	
	
	

}
