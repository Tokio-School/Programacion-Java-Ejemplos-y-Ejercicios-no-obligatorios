package ejem03_arraylist;

import java.util.ArrayList;

public class Persona {
	
	private ArrayList<Persona> familiares;
	
	private String nombre,apellidos;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		familiares=new ArrayList<Persona>();
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]->"+familiares.toString();
	}
	
	public void addFamiliar(Persona nuevoFamiliar)
	{
		familiares.add(nuevoFamiliar);
	}
	

}