package ejem01_claseinterna_estatica;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado pepe=new Empleado("Pepe",22);
		pepe.asignarRol(Empleado.Rol.ADMINISTRATIVO);
		
		System.out.println(pepe);
		
		
	}	

}
