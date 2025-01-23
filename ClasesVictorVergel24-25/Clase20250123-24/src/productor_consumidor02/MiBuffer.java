package productor_consumidor02;

import java.util.ArrayList;

public class MiBuffer {
	private ArrayList<String> datos=new ArrayList<>();
	/**
	 * @param dato
	 */
	public MiBuffer(ArrayList<String> datos) {
		super();
		this.datos = datos;
	}

	/**
	 * 
	 */
	public MiBuffer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MiBuffer [datos=" + datos + "]";
	}

	public ArrayList getDatos() {
		return datos;
	}

	public void setDatos(ArrayList datos) {
		this.datos = datos;
	}

	public synchronized void poner(String dato) {
		// TODO Auto-generated method stub
		datos.add(dato);
		notify();
	}

	public synchronized String cogerDato() {
        if (datos.isEmpty())
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return (String) datos.remove(0);
	}


	

}
