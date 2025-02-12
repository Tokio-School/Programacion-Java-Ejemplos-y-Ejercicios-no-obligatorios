package ejem03_creandoNuestroIteradorParametrizado;

import java.util.Arrays;
import java.util.Iterator;

public class MiArrayList<T> implements Iterable<T> {

	private T[] datos;

	/**
	 * @param datos
	 */
	public MiArrayList(T[] datos) {
		super();
		this.datos = datos;
	}
	
	public MiArrayList(int tamano) {
		super();
		this.datos = (T[]) new Object[tamano];
	}

	public void remove(int index) {

		for (int i = index - 1; i < datos.length - 1; i++) {
			datos[i] = datos[i + 1];
		}
		datos[datos.length - 1] = null;
	}
	
	public void remove(String dato) {

		boolean elementoBorrado=false;
		for (int i = 0; i < datos.length && !elementoBorrado; i++) {
			if (datos[i].equals(dato)) {
				remove(i+1);
				elementoBorrado=true;
			}
		}
	}

	
	public void add(T dato) {
		boolean datoColocado=false;
		for (int i = 0; i < datos.length && !datoColocado; i++) {
			if (datos[i] == null) {
				datos[i] = dato;
				datoColocado=true;
			}
		}
	}
	
	@Override
	public MiIterador iterator() {
		// TODO Auto-generated method stub
		return new MiIterador();
	}
	
	public class MiIterador implements Iterator<T>
	{
		private int posicion=0;

		@Override
		public boolean hasNext() {

			return posicion<datos.length; 
		}

		@Override
		public T next() {
			T dato=(T) datos[posicion];
			posicion++;
			return dato;
		}
		
	}
	
	
	

	@Override
	public String toString() {
		return "MiArrayList [datos=" + Arrays.toString(datos) + "]";
	}
	
	
	
	
	
}
