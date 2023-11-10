package ejem03_ejemploProyectoHerencia;

public class Matricula {
	private String nombre;

	public Matricula() {
		super();
	}
	public Matricula(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int calcularPrecio()
	{
		return (this instanceof Curso)?500:200;
	}
	
}
