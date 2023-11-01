package ejem02_interfacesYaExistentes;

public class Ejem01_MyString implements CharSequence {
    
	private String cadena;

	public Ejem01_MyString(String cadena) {
		super();
		this.cadena = cadena;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return cadena.length();
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return cadena.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return cadena.subSequence(start, end);
	}
	
	public static void main(String args[])
	{
		Ejem01_MyString micadena=new Ejem01_MyString("Hola Mundo");
		System.out.println(micadena.length());
	}

   
}
