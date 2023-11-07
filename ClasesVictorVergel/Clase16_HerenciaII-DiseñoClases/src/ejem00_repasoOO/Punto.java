package ejem00_repasoOO;

public class Punto {
	private int x;
	private int y;
	
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("---"+this.hashCode());
	}


	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}



	
	

}
