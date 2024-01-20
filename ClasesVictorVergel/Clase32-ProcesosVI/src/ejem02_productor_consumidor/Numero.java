package ejem02_productor_consumidor;

// TODO: Auto-generated Javadoc
/**
 * The Class Numero.
 */
public class Numero {
	
	/** The numero. */
	private int numero;

	/**
	 * Gets the numero. Éste es ejecutado por el consumidor
	 *
	 * @return the numero
	 */
	public synchronized int getNumero() {
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numero;
	}

	
	/**
	 * Sets the numero. Éste es ejecutado por el productor
	 *
	 * @param numero the new numero
	 */
	public synchronized void setNumero(int numero) {
		this.numero = numero;
		
		
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
