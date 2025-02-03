package ejem04_acciones_sobre_procesos;

public class Contador {
	int cont;

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * @param cont
	 */
	public Contador(int cont) {
		super();
		this.cont = cont;
	}

	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
	
}
