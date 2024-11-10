
public class Calculadora {

	public Posicion sumar(Posicion p1, Posicion p2) {
		Posicion p = new Posicion(p1.getX() + p2.getX(), p1.getY() + p2.getY());
		return p;
	}

	public Posicion resta(Posicion p1, Posicion p2) {
		Posicion p = new Posicion(p1.getX() - p2.getX(), p1.getY() - p2.getY());
		return p;
	}

}
