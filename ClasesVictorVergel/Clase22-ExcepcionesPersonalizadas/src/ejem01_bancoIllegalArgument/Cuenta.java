package ejem01_bancoIllegalArgument;

public class Cuenta {
	private int saldo;
	private Cliente titular;
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cuenta(int saldo, Cliente titular)  {
		super();
		
		if (saldo<0)
			throw new ErrorSaldo("No podemos crear una cuenta con saldo inicial negativo");
		this.saldo = saldo;
		this.titular = titular;
	}
	public Cuenta() {
		super();
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	public void ingresar(int cantidad)
	{
		saldo+=cantidad;
	}
	
	/**
	 * Retirar.
	 *
	 * @param cantidad the cantidad
	 * @return the int. El saldo actual después de retirar ese dinero.
	 * @throws ErrorSaldo 
	 */
	public int retirar(int cantidad) 
	{
		if (cantidad>saldo)
			throw new ErrorSaldo("Error en el saldo, no podemos sacar más dinero del existente.");
		System.out.println("-----------------");
		saldo-=cantidad;
		return saldo;
	}

}
