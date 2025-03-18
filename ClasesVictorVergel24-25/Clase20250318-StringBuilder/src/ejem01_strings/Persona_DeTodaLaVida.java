package ejem01_strings;

public class Persona_DeTodaLaVida {
	private String nombre;
	private int edad;
	
	public Persona_DeTodaLaVida(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	/**
	 * 
	 */
	public Persona_DeTodaLaVida() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (nombre.hashCode() + edad)*37;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}
	
	

}
