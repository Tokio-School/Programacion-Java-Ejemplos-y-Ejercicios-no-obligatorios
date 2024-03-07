package ejem02_expresionesLambda;

@FunctionalInterface
public interface Saludador {
	public void saludar(String nombre);
	default public void saludarEfusivamente() { System.out.println("soy un tío muy majo");};
}
