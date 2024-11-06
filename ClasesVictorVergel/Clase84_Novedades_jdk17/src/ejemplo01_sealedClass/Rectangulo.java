package ejemplo01_sealedClass;

public final class Rectangulo extends Figura{

	private final double base;
	private final double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * altura;
	}

}
