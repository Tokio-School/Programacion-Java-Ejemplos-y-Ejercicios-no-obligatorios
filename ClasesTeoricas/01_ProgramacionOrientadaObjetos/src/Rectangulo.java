
// TODO: Auto-generated Javadoc
/**
 * The Class Rectangulo.
 */
public class Rectangulo extends Poligono implements Figura {
	
	/** The punto 1. Se trata del punto superior izquierda que define el cuardrado */
	private Posicion punto1;
	
	/** The punto 2. */
	private Posicion punto2;
	
	@Override
	public int getLados() {
		// TODO Auto-generated method stub
		return 4;
	}

	/**
	 * Gets the punto 1. 
	 *
	 * @return the punto 1
	 */
	public Posicion getPunto1() {
		return punto1;
	}
	
	/**
	 * Sets the punto 1.
	 *
	 * @param punto1 the new punto 1
	 */
	public void setPunto1(Posicion punto1) {
		this.punto1 = punto1;
	}
	
	/**
	 * Gets the punto 2.
	 *
	 * @return the punto 2
	 */
	public Posicion getPunto2() {
		return punto2;
	}
	
	/**
	 * Sets the punto 2. Punto inferior derecha que definde el cuadrado
	 *
	 * @param punto2 the new punto 2
	 */
	public void setPunto2(Posicion punto2) {
		this.punto2 = punto2;
	}

	/**
	 * Instantiates a new rectangulo. Constructor que recibe los dos puntos que constituyen
	 * el cuadrado. <a href="https://www.google.com">Google</a>	
	 *
	 * @param punto1 the punto 1
	 * @param punto2 the punto 2
	 */
	public Rectangulo(Posicion punto1, Posicion punto2) {
		super();
		this.punto1 = punto1;
		this.punto2 = punto2;
	}
	
	/**
	 * To string. Convierte a texto.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Este rectangulo tiene estos valores [punto1=" + punto1 + ", punto2=" + punto2 + "]";
	}

	@Override
	public int superficie() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	
	
}
