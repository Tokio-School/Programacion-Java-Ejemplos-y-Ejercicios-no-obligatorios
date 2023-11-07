package ejem00_repasoOO;

public class Poligono implements Transportable{
	
	private int numeroPuntos;

	public int getNumeroPuntos() {
		return numeroPuntos;
	}

	public void setNumeroPuntos(int numeroPuntos) {
		this.numeroPuntos = numeroPuntos;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		if (this instanceof Rectangulo)
			System.out.println("He movido el Rectangulo");
		else
			System.out.println("He movido el Poligono");
	}
	

}
