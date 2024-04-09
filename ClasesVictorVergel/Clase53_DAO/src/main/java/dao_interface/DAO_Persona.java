package dao_interface;

import java.util.ArrayList;

import modelo.Persona;

public interface DAO_Persona {
	
	public ArrayList<Persona> listar();
	
	public void insertar(Persona persona);
	
	public void borrar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public Persona buscarPorId(String nombre);
	

}
