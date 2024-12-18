package ejem0_clasesinternas;

public class Aplicacion {

	public static void main(String[] args) {
		
		// Con Rol estático
		/*Direccion d1 = new Direccion("Calle", "Mayor", 21, 1, "Madrid");
		Empleado e1 = new Empleado("Juan", 3000, d1,Empleado.Rol.JEFE);
		Empresa emp1 = new Empresa("Telefonica", d1);*/
		
		// Con Rol no estático
		Empleado e2 = new Empleado();
		Empleado.Rol r1 = e2.new Rol();
		Direccion d1 = new Direccion("Calle", "Mayor", 21, 1, "Madrid");
		Empleado e1 = new Empleado("Juan", 3000, d1,r1.JEFE);
		Empresa emp1 = new Empresa("Telefonica", d1);
	}

}
