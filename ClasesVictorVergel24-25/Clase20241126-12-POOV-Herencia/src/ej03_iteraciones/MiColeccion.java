package ej03_iteraciones;

import java.util.ArrayList;
import java.util.Iterator;

public class MiColeccion implements Iterable<String> {
	private String[] datos;
	private int contador = 0;
	

/*	public MiColeccion(String[] datos) {
		super();
		this.datos = datos;
	}*/
	
	public MiColeccion(String... datos) {
		super();
		this.datos = datos;
	}

	@Override
	public MiIterador iterator() {
		// TODO Auto-generated method stub
		return new MiIterador();
	}

	
	public class MiIterador implements Iterator<String> {
		private int contador = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return contador < datos.length;
		}

		@Override
		public String next() {
            return datos[contador++];
		}

	}

	

}
