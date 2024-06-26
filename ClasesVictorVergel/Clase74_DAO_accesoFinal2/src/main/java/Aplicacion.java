import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import DAO_Implementacion.DAO_Persona_CSV;
import DAO_Implementacion.DAO_Persona_MySQL;
import DAO_Implementacion.DAO_Persona_json;
import modelo.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		
		//DAO_Persona_CSV datos= new DAO_Persona_CSV();
		//DAO_Persona_json datos= new DAO_Persona_json();
		DAO_Persona_MySQL datos= new DAO_Persona_MySQL();
		
		//datos.listar().forEach(persona -> System.out.println(persona));
		
		datos.insertar(new Persona("Juan23", 23,1500));
		datos.insertar(new Persona("Luis", 23,1500));
		
		/*datos.actualizar(new Persona("Luis", 24,1550));
		datos.borrar(new Persona("Juan23", 23,1500));
		
		
		datos.listar().forEach(persona -> System.out.println(persona));
		datos.guardar();*/
	}
	
}