package dao_implementation;

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

import crud.CRUD_Persona;
import modelo.Persona;

public class DAO_Persona_json implements CRUD_Persona {

	ArrayList<Persona> listaPersonas=new ArrayList<Persona>();

	
	public DAO_Persona_json() {
		super();
		// TODO Auto-generated constructor stub
		InputStream is = getClass().getClassLoader().getResourceAsStream("Personas.json");
		InputStreamReader isr = new InputStreamReader(is);
		JsonElement jsonElement=JsonParser.parseReader(isr);
		
		listaPersonas=new Gson().fromJson(jsonElement, new TypeToken<ArrayList<Persona>>() {}.getType());
		
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



	@Override
	public ArrayList<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return listaPersonas;
	}



	@Override
	public Persona buscarPersona(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean insertarPersona(Persona persona) {
		if (buscarPersona(persona.getNombre()) == null) {
			listaPersonas.add(persona);
			guardar();
			return true;
		}
		return false;
	}



	@Override
	public boolean actualizarPersona(Persona persona) {

		for (int i = 0; i < listaPersonas.size(); i++) {
			if (listaPersonas.get(i).getNombre().equalsIgnoreCase(persona.getNombre())) {
				listaPersonas.set(i, persona);
				guardar();
				return true;
			}
		}
		return false;
	}




	@Override
	public boolean eliminarPersona(String nombre) {
		for (int i = 0; i < listaPersonas.size(); i++) {
			if (listaPersonas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				listaPersonas.remove(i);
				guardar();
				return true;
			}
		}
		return false;
	}

}
