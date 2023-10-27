package duda_asignacionobjetos;

//final public class Poligono {
public class Poligono {
	private int numeroPuntos;

	public void medotoSobreescrito()
	{
		System.out.println("Soy el método del Poligono");
	}
	
	public int getNumeroPuntos() {
		return numeroPuntos;
	}

	public void setNumeroPuntos(int numeroPuntos) {
		this.numeroPuntos = numeroPuntos;
	}
	
	public void mostrarDatosObjecto()
	{
		System.out.print("mensaje ");
		if (this instanceof Triangulo)
			System.out.println(" Triangulo ");
		else if (this instanceof Cuadrado)
			System.out.println(" Cuadradro");
	}
	
	
}
