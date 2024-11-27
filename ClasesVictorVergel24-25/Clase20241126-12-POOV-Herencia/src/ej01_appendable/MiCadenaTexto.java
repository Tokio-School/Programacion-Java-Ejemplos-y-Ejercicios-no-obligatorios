package ej01_appendable;

import java.io.IOException;
import java.util.Arrays;

public class MiCadenaTexto implements CharSequence, Appendable {
	private char[] cadena;
	

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
		return cadena[index];
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
	
	
	
	

	@Override
	public Appendable append(CharSequence csq) throws IOException {
		char[] nuevo = new char[this.length() + csq.length()];
		for (int i = 0; i < this.length(); i++) {
			nuevo[i] = cadena[i];
		}
		for (int i = 0; i < csq.length(); i++) {
			nuevo[this.length() + i] = csq.charAt(i);
		}
		this.cadena=nuevo;
		return this;
	}

	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(char c) throws IOException {
		char[] nuevo = new char[cadena.length + 1];
		for (int i = 0; i < cadena.length; i++) {
			nuevo[i] = cadena[i];
		}
		nuevo[cadena.length] = c;
		cadena=nuevo;
		return this;
	}
	
	

}
