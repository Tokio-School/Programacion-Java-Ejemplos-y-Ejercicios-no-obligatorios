package productor_consumidor01;

public class MiBuffer {
	private String dato;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	/**
	 * @param dato
	 */
	public MiBuffer(String dato) {
		super();
		this.dato = dato;
	}

	/**
	 * 
	 */
	public MiBuffer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MiBuffer [dato=" + dato + "]";
	}
	

}
