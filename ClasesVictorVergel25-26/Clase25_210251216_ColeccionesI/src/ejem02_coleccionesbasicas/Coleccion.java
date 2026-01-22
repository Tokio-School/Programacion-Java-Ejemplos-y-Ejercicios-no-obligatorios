package ejem02_coleccionesbasicas;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Coleccion<U> implements Collection<U>,Serializable, Iterable<U> {
	
	private U datos[]= (U[]) new Object[0];

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return datos.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MiIterator<U> iterator() {
		
		return new MiIterator<U>();
	}
	
	public class MiIterator<T> implements Iterator<T>{
		private int posicionActual=0;
		
		@Override
		public boolean hasNext() {
			return posicionActual<datos.length;
		}

		@Override
		public T next() {
			return (T) datos[posicionActual++];
		}
	}
	
	

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(U dato) {
		datos = java.util.Arrays.copyOf(datos, datos.length + 1);
		datos[datos.length - 1] = dato;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends U> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		datos = (U[]) new Object[0];
		//datos=null;
	}

	@Override
	public String toString() {
		return "Coleccion [datos=" + Arrays.toString(datos) + "]";
	}
	
	
	
	
}
