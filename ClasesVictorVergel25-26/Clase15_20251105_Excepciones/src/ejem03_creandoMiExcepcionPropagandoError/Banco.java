package ejem03_creandoMiExcepcionPropagandoError;

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
	public void retirar(double cantidad) throws SaldoInsuficienteException {
		if (cantidad > saldo) {
		//	try {
				throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad + ", saldo actual: " + saldo);
	/*		} catch (SaldoInsuficienteException e) {
				System.out.println("error:--->"+e.getMessage());
				return;
			}*/
		}
		saldo -= cantidad;
		System.out.println("El saldo final es: " + (saldo));
	}
	
	
}
