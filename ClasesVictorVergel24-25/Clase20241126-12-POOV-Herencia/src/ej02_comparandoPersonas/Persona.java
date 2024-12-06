package ej02_comparandoPersonas;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private int edad;
	private String apellido;
	
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
	/**
	 * @param nombre
	 * @param apellido 
	 * @param edad
	 */
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
	}


	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.nombre.equals(((Persona)obj).nombre) && this.edad==((Persona)obj).edad;
	}
	
	
	@Override
	public int compareTo(Persona o) {
		if (this.nombre.equals(o.nombre)) {
			return this.apellido.compareTo(o.apellido);
		} else 
			return this.nombre.compareTo(o.nombre);
	}

}
