package ejemplo1.charsequence;

import java.util.Arrays;

public class MiCadenaTexto implements CharSequence {
	private char[] cadena;
	
	
	
	PRACTICA 155555555555555 PARA EL MARTES 
	y ORDENACIÓN DE LISTAS CON EL COMPARABLE... 
	
	
	
	
	
	
	

	/**
	 * @param cadena
	 */
	public MiCadenaTexto(char[] cadena) {
		super();
		this.cadena = cadena;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return cadena.length;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		char[] subCadena = Arrays.copyOfRange(cadena, start, end);
		MiCadenaTexto miCadena = new MiCadenaTexto(subCadena);
		return miCadena;
	}

	@Override
	public String toString() {
		return "MiCadenaTexto [cadena=" + Arrays.toString(cadena) + "]";
	}
	
	

}
