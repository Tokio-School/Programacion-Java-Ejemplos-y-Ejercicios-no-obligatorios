
public class Ejem03_Persona implements Comparable<Ejem03_Persona> {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param nombre
	 */
	public Ejem03_Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public Ejem03_Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ejem03_Persona [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Ejem03_Persona o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
	
	
	
}	
