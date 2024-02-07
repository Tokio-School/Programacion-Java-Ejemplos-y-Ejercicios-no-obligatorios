package ejem00_clasesParametrizadas;

public class Conjunto<T> {
	private T dato;

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Conjunto(T dato) {
		super();
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "Conjunto [dato=" + dato + "]";
	}
	
	

}
