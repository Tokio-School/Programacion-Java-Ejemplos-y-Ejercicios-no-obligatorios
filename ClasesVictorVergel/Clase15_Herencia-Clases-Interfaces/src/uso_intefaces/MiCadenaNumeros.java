package uso_intefaces;

public class MiCadenaNumeros implements CharSequence, Comparable{
	
	
	private String numeros;

	
	public MiCadenaNumeros(String numeros) {
		super();
		if (numeros.matches("\\d+"))
			this.numeros = numeros;
		else
			numeros="no valido";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		if (numeros.equals("no valido"))
			return 0;
		else
			return numeros.length();
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return numeros.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return numeros.subSequence(start, end);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return numeros.compareTo(o.toString());
	}

}
