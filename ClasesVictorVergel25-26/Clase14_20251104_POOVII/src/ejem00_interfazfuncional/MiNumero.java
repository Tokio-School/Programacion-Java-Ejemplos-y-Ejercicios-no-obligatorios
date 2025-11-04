package ejem00_interfazfuncional;

public class MiNumero implements Sumable {
	private int numero;

	public MiNumero(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int sumar(int a) {
 		return numero + a;
	}
	
}
