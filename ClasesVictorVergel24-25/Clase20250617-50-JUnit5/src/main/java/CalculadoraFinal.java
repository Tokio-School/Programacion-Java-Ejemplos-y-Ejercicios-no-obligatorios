


public class CalculadoraFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraFinal calc=new CalculadoraFinal();
		System.out.println(calc.sumar(7,9));
	}
	

	public int sumar(int d, int e)
	{
		/*try {
			Thread.sleep(1001);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		//Comentario de prueba
		return d+e;
	}
	
	/** 
	 * Metodo de multiplicación de la calculadora
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiplica(int a, int b)
	{
		return b*a;
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
