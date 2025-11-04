package ejem02_masejemplosLambda;

@FunctionalInterface
public interface Operacion {
	public int operar(int a, int b);
	public static void metodoEstatico() {
		System.out.println("Metodo estatico en la interfaz funcional");
	}
	public default void metodoDefault() {
		System.out.println("Metodo default en la interfaz funcional");
	}
}
