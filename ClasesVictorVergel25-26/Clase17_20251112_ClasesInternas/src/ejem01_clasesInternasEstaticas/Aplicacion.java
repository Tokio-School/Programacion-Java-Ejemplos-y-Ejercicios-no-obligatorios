package ejem01_clasesInternasEstaticas;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1 = new Empleado("Juan Perez", 2500.50,Empleado.EmpleosPosibles.PROGRAMADOR);
		System.out.println("Número de empleados actual:"+Empleado.numeroEmpleados+" Empleado actual creado:"+   emp1);
		Empleado emp2 = new Empleado("Ana Gomez", 3000.75,Empleado.EmpleosPosibles.ANALISTA);
		System.out.println("Número de empleados actual:"+Empleado.numeroEmpleados+" Empleado actual creado:"+   emp2);
		Empleado emp3 = new Empleado("Luis Rodriguez", 2800.00,Empleado.EmpleosPosibles.JEFE_PROYECTO);
		System.out.println("Número de empleados actual:"+Empleado.numeroEmpleados+" Empleado actual creado:"+   emp3);
		
		
	}

}
