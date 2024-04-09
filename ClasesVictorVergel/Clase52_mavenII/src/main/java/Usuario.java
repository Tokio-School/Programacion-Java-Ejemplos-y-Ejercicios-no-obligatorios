
// TODO: Auto-generated Javadoc
/**
 * The Class Usuario.
 */
public class Usuario {
	
	/** The nombre. */
	String nombre;
	
	/** The apellido. */
	String apellido;
	
	/** The edad. */
	int edad;

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
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * Instantiates a new usuario.
	 *
	 * @param nombre the nombre. Lo meto porque necesita un nombre mínimo
	 * @param apellido the apellido. <b>Este es el apellido</b>
	 * @param edad the edad
	 */
	public Usuario(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
}
