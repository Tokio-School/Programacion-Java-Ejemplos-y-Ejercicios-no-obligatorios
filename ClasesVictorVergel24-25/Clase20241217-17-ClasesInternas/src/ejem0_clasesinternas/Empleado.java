package ejem0_clasesinternas;

public class Empleado {
	private String nombre;
	private double sueldo;
	private Direccion direccion;
	private String rol;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * @param nombre
	 * @param sueldo
	 * @param direccion
	 * @param rol 
	 */
	public Empleado(String nombre, double sueldo, Direccion direccion, String rol) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.direccion = direccion;
		this.rol = rol;
	}
	/**
	 * 
	 */
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", direccion=" + direccion + "]";
	}
	
	
	/*public static class Rol {
		public static final String JEFE = "Jefe";
		public static final String EMPLEADO = "Empleado";
		public static final String BECARIO = "Becario";
	}*/
	
	public class Rol {
		public static final String JEFE = "Jefe";
		public static final String EMPLEADO = "Empleado";
		public static final String BECARIO = "Becario";
	}

}
