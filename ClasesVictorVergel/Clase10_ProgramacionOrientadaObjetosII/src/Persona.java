
public class Persona {
	
	private String nombre;
	private int edad;
	private boolean casado;
	private Coche[] coches=new Coche[MAX_COCHE];
	private int numCoches=0;
	public static final int MAX_COCHE=4;
	
	
	public Persona(String nombre, int edad, boolean casado, Coche coche) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
		this.coches[0]=coche;
		numCoches++;
	}
	
	public Persona(String nombre, int edad, boolean casado, Coche[] coches) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
		this.coches=coches;
	}
	
	public Persona(String nombre, int edad, boolean casado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
	}
	
	/*public Coche getCoche() {
		return coche;
	}*/

	public void setCoche(Coche coche) {
		System.out.println("Número de coches:"+coches.length);
		this.coches[numCoches]= coche;
		numCoches++;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public void mostrarDatos()
	{
//		if (coches[2]==null)
//			System.out.println("es nulo");
		String datosCoches="";
		for (Coche coche : coches) {
			if (coche!=null)
				datosCoches+=coche.mostrarDatoCoche();
		}
//		for (int i = 0; i < coches.length; i++) {
//			if (coches[i]!=null)
//				datosCoches+=coches[i].mostrarDatoCoche();
//		}
		System.out.println(nombre+"-"+edad+"-"+casado+"-"+datosCoches);
	}
	
	public void ventaCoche(Coche cocheEnVenta)
	{
		for (int i = 0; i < coches.length; i++) {
			if (coches[i]!=null)
				if (coches[i]==cocheEnVenta)
				{
					coches[i]=null;	
					numCoches--;
				}
		}
	}
	
}
