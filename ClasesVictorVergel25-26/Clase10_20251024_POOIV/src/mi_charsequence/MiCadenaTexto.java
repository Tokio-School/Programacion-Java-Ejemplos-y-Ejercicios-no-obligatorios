package mi_charsequence;

import java.util.Arrays;

public class MiCadenaTexto implements CharSequence {

	private char[] caracteres;
	
	public MiCadenaTexto(String texto) {
		this.caracteres = texto.toCharArray();
	}
	
	
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return caracteres.length;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return caracteres[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return Arrays.copyOfRange(caracteres, start, end).toString();
	}

}
