package Ejem02_interfaces_2;

public class Persona implements Cloneable{

	private String nombre;
	private int edad;
	private int dni;
	

	public Persona(String string, int i, int dni2) {
		// TODO Auto-generated constructor stub
		nombre=string;
		edad=i;
		this.dni=dni2;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	/*@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}*/


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return dni;
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

	
}
