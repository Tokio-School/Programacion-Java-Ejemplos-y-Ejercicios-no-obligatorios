package ejem03_productor_multiplesconsumidores;

// TODO: Auto-generated Javadoc
/**
 * The Class Numero.
 */
public class Numero {
	
	private boolean hayValor=false;
	private boolean fin=false;
	
	public boolean isFin() {
		return fin;
	}


	public void setFin(boolean fin) {
		this.fin = fin;
	}


	/** The numero. */
	private int numero;

	/**
	 * Gets the numero. Éste es ejecutado por el consumidor
	 *
	 * @return the numero
	 */
	public synchronized int getNumero() {
		notify();
		do
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while (!hayValor && !fin);
		hayValor=false;
		if (fin)
			return 33;
		else
			return numero;
	}

	
	/**
	 * Sets the numero. Éste es ejecutado por el productor
	 *
	 * @param numero the new numero
	 */
	public synchronized void setNumero(int numero) {
		this.numero = numero;
		hayValor=true;
		
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
