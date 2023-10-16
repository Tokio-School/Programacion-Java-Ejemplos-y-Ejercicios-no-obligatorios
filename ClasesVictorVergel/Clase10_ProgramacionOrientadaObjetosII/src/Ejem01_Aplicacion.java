
public class Ejem01_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1ª opción modificar el constructor de Persona
		Coche renault=new Coche("Renault", "Clio", 1200);
		Persona maria=new Persona("Maria", 18, false,renault);
		
		
		// 2ª opción añadir los métodos de asignación correspondientes al coche
		// en la Persona.
		
		
		/*Persona maria=new Persona("Maria", 18, false);
		Coche renault=new Coche("Renault", "Clio", 1200);
		maria.setCoche(renault);
		System.out.println(Persona.MAX_COCHE);*/
		
		Coche mercedes=new Coche("Mercedes", "A3", 3200);
		maria.setCoche(mercedes);
		
		maria.mostrarDatos();
		maria.ventaCoche(mercedes);
		maria.mostrarDatos();
		
		
	}

}
