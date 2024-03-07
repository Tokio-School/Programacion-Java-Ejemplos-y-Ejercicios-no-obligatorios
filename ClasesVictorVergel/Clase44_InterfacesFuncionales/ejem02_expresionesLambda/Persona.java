package ejem02_expresionesLambda;

public class Persona implements Saludador {

	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void saludar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Hola soy "+nombre);
	}

}
