package ejem01_miiterable;

import java.util.Arrays;
import java.util.Iterator;

public class Conjunto implements Iterable<Integer>  {

	private Integer[] datos;
	@Override
	public String toString() {
		return "Conjunto [datos=" + Arrays.toString(datos) + ", posicion=" + posicion + "]";
	}

	private int posicion=0;
	
	
	public Conjunto(int capacidad) {
		super();
		this.datos = (Integer []) new Integer[capacidad];
//		this.datos = (Integer []) new Object[capacidad];
	}
	
	public void add(Integer numero)
	{
		datos[posicion]=numero;
		posicion++;
	}
	
	public Integer remove()
	{
		posicion--;
		Integer resultado=datos[posicion];
		datos[posicion]=null;
		return resultado;
	}
	
	
	public Conjunto(Integer[] datos) {
		super();
		this.datos = datos;
	}


	@Override
	public IteradorNumero iterator() {
		// TODO Auto-generated method stub
		return new IteradorNumero();
	}
	
	private class IteradorNumero implements Iterator<Integer>
	{
		private int contadorIterador=0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return contadorIterador<posicion;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			if (!hasNext())
				throw new IllegalStateException("No hay más elementos");
			
			Integer temp=datos[contadorIterador];
			contadorIterador++;
			return temp;
		}
	
	}
	
}
