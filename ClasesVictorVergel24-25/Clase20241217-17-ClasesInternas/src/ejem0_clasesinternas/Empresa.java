package ejem0_clasesinternas;

public class Empresa {
	
	private String nombre;
	private Direccion direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * @param nombre
	 * @param direccion
	 */
	public Empresa(String nombre, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	/**
	 * 
	 */
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
}
