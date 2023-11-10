package ejem01_argumentosmultiples;

public class Calculadora {
	/*public int sumar(int a, int b)
	{
		return a+b;
	}
	public int sumar(int a, int b,int c)
	{
		return a+b+c;
	}*/
	public int sumar(int... parametros)
	{
		int resultado=0;
		for (int i : parametros) {
			resultado+=i;
		}
		for (int i = 0; i < parametros.length; i++) {
			System.out.println("-->"+parametros[i]);
		}
		return resultado;
	}
	
	public String concatencacion(String... cadenas)
	{
		String resultado="";
		for (String string : cadenas) {
			resultado+=string;
		}
		return resultado;
	}
}
