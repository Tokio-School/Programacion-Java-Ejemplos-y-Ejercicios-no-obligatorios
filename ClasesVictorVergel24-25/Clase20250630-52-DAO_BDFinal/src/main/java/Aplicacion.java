import dao_implementation.DAO_Persona_CSV;
import dao_implementation.DAO_Persona_json;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aplicación de ejemplo para DAO y BD");
		//DAO_Persona_CSV dao = new DAO_Persona_CSV();
		DAO_Persona_json dao = new DAO_Persona_json();
		dao.listarPersonas().forEach(persona -> {
			System.out.println(persona);
		});
		
		dao.insertarPersona(new modelo.Persona("Juan", 30, 3000.0));
		
		dao.actualizarPersona(new modelo.Persona("Juan", 31, 3500.0));
		
		//dao.eliminarPersona("Juan");
		
		dao.listarPersonas().forEach(persona -> {
			System.out.println(persona);
		});
		
		
		
	}

}
