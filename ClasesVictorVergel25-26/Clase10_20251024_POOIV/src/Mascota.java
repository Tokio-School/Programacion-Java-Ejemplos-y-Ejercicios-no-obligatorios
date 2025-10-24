
// TODO: Auto-generated Javadoc
/**
 * The Class Mascota.
 */
public class Mascota {
	
	/** The nombre. */
	private String nombre;

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
	 * Instantiates a new mascota.
	 *
	 * @param nombre the nombre
	 */
	public Mascota(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Instantiates a new mascota.
	 */
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + "]";
	}
	

	
}
