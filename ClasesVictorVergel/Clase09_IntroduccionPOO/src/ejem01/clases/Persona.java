package ejem01.clases;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona {
	
	
	/** The nombre. Es uno de los atributos principales */
	private String nombre;
	
	/** The edad. Este atributo guardará la información de la edad.*/
	private int edad;
	
	/** The casado. */
	private boolean casado; 
	
	
	
	
	/**
	 * Instantiates a new persona.
	 */
	public Persona() {
	}


	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 */
	public Persona(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Instantiates a new persona. Este método construye un objeto 
	 * inicializando con más valores
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 * @param casado the casado
	 */
	public Persona(String nombre, int edad, boolean casado) {
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
	}
	
	/**
	 * Imprimir datos persona.
	 */
	public void imprimirDatosPersona()
	{
		System.out.println(this.nombre+" - "+ this.edad+ " - "+ this.casado);
	}
	
	/**
	 * Imprimir datos persona.
	 */
	public void imprimirDatosPersona(boolean formateado)
	{
		if (formateado)
			System.out.println(this.nombre+" \n- "+ this.edad+ " \n- "+ this.casado);
		else
			System.out.println(this.nombre+" - "+ this.edad+ " - "+ this.casado);
	}

	/**
	 * Imprimir datos persona.
	 */
	public String imprimirDatosPersona2()
	{
		return this.nombre+" - "+ this.edad+ " - "+ this.casado;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
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


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	
}
