package ejem00_appendable;

import java.io.IOException;
import java.util.Arrays;

public class CadenaCaracteres implements Appendable {

	private char cadena[]=new char[10]; 
	
	public CadenaCaracteres() {
		super();
		// TODO Auto-generated constructor stub
		Arrays.fill(cadena, '-');
	}

	@Override
	public Appendable append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		char temporal[]=Arrays.copyOf(cadena, cadena.length+csq.length());
		for (int i = cadena.length; i < temporal.length; i++) {
			temporal[i]=csq.charAt(i-cadena.length);
		}
		this.cadena=temporal;
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
		char temporal[]=Arrays.copyOf(cadena, cadena.length+1);
		temporal[cadena.length]=c;
		this.cadena=temporal;
		return this;
	}

	@Override
	public String toString() {
		return "CadenaCaracteres [cadena=" + Arrays.toString(cadena) + "]";
	}
	
	

}
