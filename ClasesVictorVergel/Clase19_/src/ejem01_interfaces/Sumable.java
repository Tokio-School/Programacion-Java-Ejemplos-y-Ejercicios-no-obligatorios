package ejem01_interfaces;

@FunctionalInterface
public interface Sumable<T> {
	T suma(T dato1,T dato2);
	default void saludar() {System.out.println("hola desde la Intefaz");}
	static int suma2(int a, int b) {return a+b; }
}
