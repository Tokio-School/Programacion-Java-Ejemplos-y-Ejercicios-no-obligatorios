package ejem01_creandoNuestroIterador;

import java.util.Arrays;
import java.util.Iterator;

public class MiArrayList implements Iterable<String> {

	private String[] datos;

	/**
	 * @param datos
	 */
	public MiArrayList(String[] datos) {
		super();
		this.datos = datos;
	}
	
	public MiArrayList(int tamano) {
		super();
		this.datos = new String[tamano];
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

	
	public void add(String dato) {
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
	
	public class MiIterador implements Iterator<String>
	{
		private int posicion=0;

		@Override
		public boolean hasNext() {

			return posicion<datos.length; 
		}

		@Override
		public String next() {
			String dato=datos[posicion];
			posicion++;
			return dato;
		}
		
	}
	
	
	

	@Override
	public String toString() {
		return "MiArrayList [datos=" + Arrays.toString(datos) + "]";
	}
	
	
	
	
	
}
