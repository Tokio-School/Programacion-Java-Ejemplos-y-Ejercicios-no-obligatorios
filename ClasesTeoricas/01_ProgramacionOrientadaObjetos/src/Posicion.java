/**
 * 
 */

/**
 * 
 */
public class Posicion {
	
	private int x;
	private int y;
	
	
	/**
	 * Constructor de una posición que recibe dos parámetros y sirve para inicializar el objeto 
	 * 
	 * @param x Coordenada x inicial
	 * @param y Coordenada y inicial
	 */
	public Posicion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	/**
	 * 
	 */
	public Posicion() {
		super();
	}


	public void mover(int valorDistancia) {
		// TODO Auto-generated method stub
		x+=valorDistancia;
		y+=valorDistancia;
	}


	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.x==((Posicion)obj).getX() && this.y==((Posicion)obj).getY();
	}
	
	
	
	
	
	

}
