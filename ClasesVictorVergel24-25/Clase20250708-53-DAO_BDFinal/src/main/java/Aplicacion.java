import dao_implementation.DAO_Persona_BD;
import dao_implementation.DAO_Persona_CSV;
import dao_implementation.DAO_Persona_json;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aplicación de ejemplo para DAO y BD");
		//DAO_Persona_CSV dao = new DAO_Persona_CSV();
		//DAO_Persona_json dao = new DAO_Persona_json();
		DAO_Persona_BD dao = new DAO_Persona_BD();

		
		dao.insertarPersona(new modelo.Persona("Juan3935", 377, 3777.0));
		
		
		dao.listarPersonas().forEach(persona -> {
			System.out.println(persona);
		});
		
		
		
		dao.actualizarPersona(new modelo.Persona("Juan33", 565, 444512.0));
		
		dao.eliminarPersona("Juan33");
		
		dao.listarPersonas().forEach(persona -> {
			System.out.println(persona);
		});
		
		dao.cerrarConexion();
		
	}

}
