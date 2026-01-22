package ejem01_xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="persona")
public class Persona implements Comparable<Persona> {
	@Element(name="nombre")
	private String nombre;
	@Element(name="edad")
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.getNombre());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.nombre.equals(((Persona)obj).getNombre()) && this.edad==((Persona)obj).getEdad();
	}
	
	
	
}
