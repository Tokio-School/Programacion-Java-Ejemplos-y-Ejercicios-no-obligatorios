
public class Mensaje implements java.io.Serializable {
	private String dato;
	private String nombreCliente;

	/**
	 * @param dato
	 * @param nombreCliente
	 */
	public Mensaje(String dato, String nombreCliente) {
		super();
		this.dato = dato;
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the dato
	 */
	public String getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(String dato) {
		this.dato = dato;
	}

	/**
	 * @param dato
	 */
	public Mensaje(String dato) {
		super();
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "Mensaje [dato=" + dato + ", nombreCliente=" + nombreCliente + "]";
	}


	
	
}
