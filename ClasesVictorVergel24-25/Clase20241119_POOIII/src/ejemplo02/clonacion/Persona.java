package ejemplo02.clonacion;

public class Persona extends SerHumano implements Cloneable {
	
	private String nombre;
	private int edad;
	
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
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]" + " y además está vivo "+isVivo();
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.nombre.equals(((Persona)obj).nombre) && this.edad==((Persona)obj).edad;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return ((Persona)super.clone());
	}
	
	
	
	

}
