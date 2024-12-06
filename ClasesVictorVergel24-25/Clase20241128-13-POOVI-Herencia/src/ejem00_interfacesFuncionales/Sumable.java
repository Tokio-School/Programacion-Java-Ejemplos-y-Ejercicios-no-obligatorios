package ejem00_interfacesFuncionales;

@FunctionalInterface
public interface Sumable {
	public int suma(int a, int b);

//	public int resta(int a, int b);
	default public void informacion() 
	{ 
		System.out.println("Soy la interfaz Sumable"); 
	};
	
	default public void informacion2() 
	{ 
		System.out.println("Soy la interfaz Sumable2"); 
	};
	
	static public int multiplica(int a, int b) {
		return a * b;
	}
}
