package ejem01_enum_complejo;

public enum TipoVehiculo {
	AUTOMOVIL("Automóvil",4),CAMIONETA("Camioneta",4),
	MOTO("Moto",2),CAMION("Camión",6);

	private String nombre;
	private int numRuedas;
	
	TipoVehiculo(String string, int i) {
		// TODO Auto-generated constructor stub
		nombre=string;
		numRuedas=i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	public static TipoVehiculo[] valores()
	{
		return values();
	}
	
	
	
	
	
	

}
