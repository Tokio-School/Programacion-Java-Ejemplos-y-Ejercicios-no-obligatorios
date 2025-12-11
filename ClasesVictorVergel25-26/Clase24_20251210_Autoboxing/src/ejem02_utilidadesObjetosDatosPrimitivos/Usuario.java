package ejem02_utilidadesObjetosDatosPrimitivos;

public class Usuario {
	private String nombre;
	private Integer edad;
	
	public Usuario(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (nombre.equals(((Usuario)obj).nombre) && edad.equals(((Usuario)obj).edad))
			return true;
		else
			return false;
	}
		
	
}
