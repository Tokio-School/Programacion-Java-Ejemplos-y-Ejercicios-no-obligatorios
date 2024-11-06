package ejemplo01_sealedClass;

public final class Circulo extends Figura{

	private final double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

}
