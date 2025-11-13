package ejem02_enums;

public class Empleado {
	static int numeroEmpleados = 0;
	private int idEmpleado ;
	private String nombre;
	private double salario;
	private String empleo;
	
	public Empleado(String nombre, double salario, EmpleosPosibles empleo) {
		this.nombre = nombre;
		this.salario = salario;
		this.empleo = empleo.getNombreEmpleo();
		//Empleado.numeroEmpleados++;
		numeroEmpleados++;
		idEmpleado = (int) (Math.random()*1000);
	}

	public int getNumeroEmpleado() {
		return idEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.idEmpleado = numeroEmpleado;
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

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", salario=" + salario + ", empleo="
				+ empleo + "]";
	}




	

}
