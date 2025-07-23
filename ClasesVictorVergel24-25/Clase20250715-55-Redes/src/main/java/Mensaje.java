
public class Mensaje implements java.io.Serializable {
	private String dato;

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
		return "Mensaje [dato=" + dato + "]";
	}
	
	
}
