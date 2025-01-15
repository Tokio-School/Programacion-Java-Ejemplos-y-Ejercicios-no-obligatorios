package compartiendo_objetos;

public class ContadorCompartido {
	public int contador = 0;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "ContadorCompartido [contador=" + contador + "]";
	}

	/**
	 * @param contador
	 */
	public ContadorCompartido(int contador) {
		super();
		this.contador = contador;
	}

	/**
	 * 
	 */
	public ContadorCompartido() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
