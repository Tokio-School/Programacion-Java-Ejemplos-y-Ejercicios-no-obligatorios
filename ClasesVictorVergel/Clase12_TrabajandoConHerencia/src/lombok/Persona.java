package lombok;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Persona extends SerVivo{
	
	private int edad,dni;
	private String nombre,direccion,apellidos;
	private boolean casado;
	
	
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}



	@Override
	public void estasVivo() {
		// TODO Auto-generated method stub
		
		System.out.print("Soy "+nombre+" ");
		super.estasVivo();
	}


	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", direccion=" + direccion + ", apellidos=" + apellidos
				+ ", casado=" + casado + "]";
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return (this.dni==((Persona)obj).dni);
	}

	/*
	
	public Persona(int edad, String nombre, String direccion, String apellidos, boolean casado) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.direccion = direccion;
		this.apellidos = apellidos;
		this.casado = casado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
*/	
	
}
