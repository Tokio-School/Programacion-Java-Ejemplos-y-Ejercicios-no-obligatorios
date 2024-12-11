package ejem02_excepcionesPersonalizadas;

public class Banco {
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void retirar(int cantidad) throws SaldoInsuficienteException
	{
		if (cantidad>saldo)
		{
			//System.out.println("Saldo insuficiente, no puedes sacar tanto dinero");
			throw new SaldoInsuficienteException("Saldo insuficiente, no puedes sacar tanto");
		}
		else
		{
			saldo -= cantidad;
		}
	}

	/**
	 * @param saldo
	 */
	public Banco(int saldo) {
		super();
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Banco [saldo=" + saldo + "]";
	}
	
	
	
}
