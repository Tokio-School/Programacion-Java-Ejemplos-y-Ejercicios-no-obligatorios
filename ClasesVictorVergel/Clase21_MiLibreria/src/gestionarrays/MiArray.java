package gestionarrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class MiArray.
 */
public class MiArray {
	
	/** The datos. */
	private int datos[];
	
	/** The numero datos. */
	private int numeroDatos=0;

	/**
	 * Instantiates a new mi array.
	 */
	public MiArray() {
		super();
		datos=new int[5];
	}
	
	/**
	 * Sets the datos.
	 *
	 * @param valores the new datos
	 */
	public void setDatos(int... valores)
	{
		
		for (int i = 0; i < valores.length; i++) {
			try {
				datos[numeroDatos]=valores[i];
			}
			catch (ArrayIndexOutOfBoundsException exception)
			{
				int[] temporal=Arrays.copyOf(datos, datos.length+(valores.length-i));
				numeroDatos--;
				i--;
				datos=temporal;
				//exception.printStackTrace();
			}
			numeroDatos++;
		}
	}
	
	/**
	 * Gets the datos.
	 *
	 * @return the datos
	 */
	public int[] getDatos()
	{
		return datos;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "MiArray [datos=" + Arrays.toString(datos) + ", numeroDatos=" + numeroDatos + "]";
	}
	
	
	
	

}
