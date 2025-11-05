package ejem03_creandoMiExcepcionPropagandoError;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
