package ejem01_interfaces;

public class Entero implements Sumable<Integer> {

	/**
	 * Suma. Vamos a sumar dos datos
	 *
	 * @param dato1 the dato 1
	 * @param dato2 the dato 2
	 * @return the integer, que es la suma de los dos
	 */
	@Override
	public Integer suma(Integer dato1, Integer dato2) {
		// TODO Auto-generated method stub
		return dato1+dato2;
	}

}
