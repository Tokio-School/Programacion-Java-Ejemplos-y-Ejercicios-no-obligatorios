package ejem01_claseinterna_estatica;

public class Empleado {
	
	private String nombre;
	private int edad;
	private String rol;
	
	public void asignarRol(String rol)
	{
		this.rol=rol;
	}
	
	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", rol=" + rol + "]";
	}
	
	
	public static class Rol {
		public static final String SUPERVISOR="supervisor";
		public static final String ADMINISTRATIVO="administrativo";
		public static final String PROGRAMADOR="programador";

	}

	
	
	

}
