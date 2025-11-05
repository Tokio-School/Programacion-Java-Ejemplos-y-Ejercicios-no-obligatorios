package ejem02_creandoMiExcepcion;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
