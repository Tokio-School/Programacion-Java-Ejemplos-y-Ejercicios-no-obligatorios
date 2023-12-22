package ejem01_holamundo;

public class ContadorComun {
	private int contador;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public ContadorComun(int contador) {
		super();
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "ContadorComun [contador=" + contador + "]";
	}
	

}
