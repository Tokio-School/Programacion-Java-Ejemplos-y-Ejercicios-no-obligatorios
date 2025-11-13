package ejem02_enums;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleosPosibles programador = EmpleosPosibles.PROGRAMADOR;
		EmpleosPosibles analista = EmpleosPosibles.ANALISTA;
		EmpleosPosibles jefeProyecto = EmpleosPosibles.JEFE_PROYECTO;
		Empleado emp1 = new Empleado("Juan Perez", 2500.50,programador);
		System.out.println("Número de empleados actual:"+Empleado.numeroEmpleados+" Empleado actual creado:"+   emp1);
		Empleado emp2 = new Empleado("Ana Gomez", 3000.75,analista);
		System.out.println("Número de empleados actual:"+Empleado.numeroEmpleados+" Empleado actual creado:"+   emp2);
		Empleado emp3 = new Empleado("Luis Rodriguez", 2800.00,jefeProyecto);
		System.out.println("Número de empleados actual:"+Empleado.numeroEmpleados+" Empleado actual creado:"+   emp3);
		
		
	}

}
