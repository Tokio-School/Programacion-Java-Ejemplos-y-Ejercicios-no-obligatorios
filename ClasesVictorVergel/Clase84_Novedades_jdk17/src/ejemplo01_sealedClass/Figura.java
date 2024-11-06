package ejemplo01_sealedClass;

public abstract sealed class Figura permits Circulo, Rectangulo{
	public abstract double area();
}
