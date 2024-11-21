package ejemplo0.comparandoobjetos;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona<T> implements Comparable<Persona> {
	
	/** The nombre. */
	private String nombre;
	
	public T getMascota() {
		return mascota;
	}

	public void setMascota(T mascota) {
		this.mascota = mascota;
	}

	/** The edad. */
	private int edad;
	
	private T mascota;
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, T mascota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		//this.mascota = (Mascota) perro;
		this.mascota = mascota;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(((Persona)obj).nombre) && this.edad==((Persona)obj).edad;
	}
	
	/**
	 * Compare to, compara una Persona con otra.
	 *
	 * @param o the o
	 * @return the int si es mayor, menor o igual dependiendo de la edad, 
	 */
	@Override
	public int compareTo(Persona persona) {
		if (this.edad > persona.edad) {
			return 1; // persona es menor
		} else if (this.edad < persona.edad) {
			return -1; // persona es mayor que el objeto actual (this)
		} else {
			return 0;
		}
	}
	

}
