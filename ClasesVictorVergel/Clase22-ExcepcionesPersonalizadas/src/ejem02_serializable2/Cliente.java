package ejem02_serializable2;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	
	private String nombre;
	private String dni;
	private int edad;
	
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
