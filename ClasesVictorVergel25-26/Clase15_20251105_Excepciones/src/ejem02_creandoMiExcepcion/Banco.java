package ejem02_creandoMiExcepcion;

public class Banco {
	private double saldo;
	
	public Banco(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	
	public double getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "Banco [saldo=" + saldo + "]";
	}
	public void retirar(double cantidad) {
		if (cantidad > saldo) {
			try {
				throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad + ", saldo actual: " + saldo);
			} catch (SaldoInsuficienteException e) {
				System.out.println("error:--->"+e.getMessage());
				return;
			}
		}
		saldo -= cantidad;
		System.out.println("El saldo final es: " + (saldo));
	}
	
	
}
