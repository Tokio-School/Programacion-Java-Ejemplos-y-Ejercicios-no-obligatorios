package ejem02_excepcionesPersonalizadas;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String nombreError) {
		super(nombreError);
	}

}
