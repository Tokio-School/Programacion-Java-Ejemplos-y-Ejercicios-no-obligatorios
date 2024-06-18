


public class CalculadoraFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraFinal calc=new CalculadoraFinal();
		System.out.println(calc.sumar(7,9));
	}
	

	public int sumar(int d, int e)
	{
		//Comentario de prueba
		return d+e;
	}
	
	public int multiplica(int a, int b)
	{
		return a*b;
	}
	public int divide(int a, int b)
	{
		return a/b;
	}

	public int resta(int a, int b) 
	{
		return a - b;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof CalculadoraFinal) 
			return true;
		return false;
	}

	

}
