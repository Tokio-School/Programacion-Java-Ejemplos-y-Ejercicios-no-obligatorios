package DAO_Implementacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import dao_interface.DAO_Persona;
import modelo.Persona;

public class DAO_Persona_json implements DAO_Persona {

	ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
	
	
	
	
	public DAO_Persona_json() {
		super();
		// TODO Auto-generated constructor stub
		InputStream is = getClass().getClassLoader().getResourceAsStream("Personas.json");
		InputStreamReader isr = new InputStreamReader(is);
		JsonElement jsonElement=JsonParser.parseReader(isr);
		
		listaPersonas=new Gson().fromJson(jsonElement, new TypeToken<ArrayList<Persona>>() {}.getType());
		
	}
	
	
	
	@Override
	public ArrayList<Persona> listar() {
		// TODO Auto-generated method stub
		return listaPersonas;
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		listaPersonas.add(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		for (Persona persona2 : listaPersonas) {
			if (persona2.getNombre().equals(persona.getNombre())) {
				persona2.setEdad(persona.getEdad());
				persona2.setSalario(persona.getSalario());
			}
		}
	}

	@Override
	public Persona buscarPorId(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Persona persona) {
		// TODO Auto-generated method stub
		listaPersonas.remove(persona);
	}
	
	public void guardar()
	{
		String json=new Gson().toJson(listaPersonas);
		try (FileWriter fichero=new FileWriter("src/main/resources/Personas.json");
			 BufferedWriter writer=new BufferedWriter(fichero);	){
			writer.write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
