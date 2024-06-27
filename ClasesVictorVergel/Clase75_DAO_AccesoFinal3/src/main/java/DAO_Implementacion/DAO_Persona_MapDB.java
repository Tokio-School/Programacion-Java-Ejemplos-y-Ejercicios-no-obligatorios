package DAO_Implementacion;

import java.util.ArrayList;

import dao_interface.DAO_Persona;
import modelo.Persona;

public class DAO_Persona_MapDB implements DAO_Persona {

	ArrayList<Persona> 	    listaPersonas = new ArrayList<Persona>();
	
	
	
	public DAO_Persona_MapDB() {
		super();
		
		
		
	}

	@Override
	public ArrayList<Persona> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public Persona buscarPorId(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public void guardar() {
		// TODO Auto-generated method stub
		
	}

}
