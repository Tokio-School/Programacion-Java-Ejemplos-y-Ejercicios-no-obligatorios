package crud;

import java.util.ArrayList;

public interface CRUD_Persona {
	
	public ArrayList<modelo.Persona> listarPersonas();
	public modelo.Persona buscarPersona(String nombre);
	public boolean insertarPersona(modelo.Persona persona);
	public boolean actualizarPersona(modelo.Persona persona);
	public boolean eliminarPersona(String nombre);

}
