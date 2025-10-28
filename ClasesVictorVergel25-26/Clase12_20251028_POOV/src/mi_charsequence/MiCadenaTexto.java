package mi_charsequence;

import java.io.IOException;
import java.util.Arrays;

public class MiCadenaTexto implements CharSequence, Appendable {

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



	@Override
	public Appendable append(CharSequence csq) throws IOException {
		caracteres = (new String(caracteres) + csq.toString()).toCharArray();
		return this;
	}



	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Appendable append(char c) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toString() {
		return "MiCadenaTexto [caracteres=" + Arrays.toString(caracteres) + "]";
	}

	
	
}
