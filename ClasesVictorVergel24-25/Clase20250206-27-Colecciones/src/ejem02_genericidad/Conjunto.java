package ejem02_genericidad;

public class Conjunto<K,T> {
	K valor1;
	T valor2;
	
	
	/**
	 * @param valor1
	 * @param valor2
	 */
	public Conjunto(K valor1, T valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	
	
	
	/**
	 * 
	 */
	public Conjunto() {
		super();
		// TODO Auto-generated constructor stub
	}




	public K getValor1() {
		return valor1;
	}
	public void setValor1(K valor1) {
		this.valor1 = valor1;
	}
	public T getValor2() {
		return valor2;
	}
	public void setValor2(T valor2) {
		this.valor2 = valor2;
	}




	@Override
	public String toString() {
		return "Conjunto [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}
	
	
	
	
}
