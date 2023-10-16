package ejem01.clases;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona juan=new Persona();
		
		Persona pepe=new Persona("Pepe");
		
		Persona maria=new Persona("Maria", 18, false);
		
		Persona miguelAngel=new Persona("Miguel Angel", 19, true);
		
		//maria.nombre="Maria Jimenez";
		maria.setNombre("Maria Jimenez");
		
		maria.imprimirDatosPersona();
		miguelAngel.imprimirDatosPersona();
		
		System.out.println("--->"+maria.imprimirDatosPersona2());
		
		System.out.println("-------------------");
		miguelAngel.imprimirDatosPersona(true);
	}

}
