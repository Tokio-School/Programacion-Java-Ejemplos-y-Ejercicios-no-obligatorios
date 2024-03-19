package ejem01_notacionFuncionalConstructores;

import java.util.UUID;

public class Empleado {
	private String nombre;
	private double salario;
	private String id;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.id = UUID.randomUUID().toString();
	}
	public Empleado()
	{
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", id=" + id + "]";
	}
	
	
	
}
