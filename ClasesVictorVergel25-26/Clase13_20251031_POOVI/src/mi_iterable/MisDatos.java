package mi_iterable;

import java.util.Iterator;

public class MisDatos<T> implements Iterable<T> {
	private T[] datos;
	/** Numero real de datos almacenados */
	private int tamano;
	
	public MisDatos(int capacidad) {
		 
		datos = (T[]) new Object[capacidad];
		tamano = 0;
	}
	public void agregar(T dato) {
		if (tamano < datos.length) {
			datos[tamano++] = dato;
		} else {
			System.out.println("No se puede agregar mas datos, capacidad llena");
		}
	}

	@Override
	public MiIterador<T> iterator() {
		return new MiIterador<T>();
	}
	
	public class MiIterador<T> implements Iterator<T> {

		private int indiceActual;
		
		public MiIterador() {
			indiceActual = 0;
		}
		
		@Override
		public boolean hasNext() {
			return indiceActual < tamano;
		}
		
		@Override
		public T next() {
			return (T) datos[indiceActual++];
		}
		
	}

}
