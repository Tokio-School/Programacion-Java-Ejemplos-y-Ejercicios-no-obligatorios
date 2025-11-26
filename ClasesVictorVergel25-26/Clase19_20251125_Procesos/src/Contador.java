
public class Contador {
	private int numero=0;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Contador() {
		super();
	}

	@Override
	public String toString() {
		return "Contador [numero=" + numero + "]";
	}
	
}
