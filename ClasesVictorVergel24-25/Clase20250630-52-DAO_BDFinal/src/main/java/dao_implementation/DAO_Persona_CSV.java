package dao_implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import crud.CRUD_Persona;
import modelo.Persona;

public class DAO_Persona_CSV implements CRUD_Persona {

//  
	ArrayList<Persona> personas = new ArrayList<Persona>();
	public DAO_Persona_CSV() {
		try (FileReader fr=new FileReader(getClass().getClassLoader().getResource("Personas.csv").getFile());
				CSVParser csv=new CSVParser(fr, CSVFormat.DEFAULT);)
		{
			for(CSVRecord csvREcord: csv) {
				String nombre = csvREcord.get(0);
				int edad= Integer.parseInt(csvREcord.get(1));
				double salario = Double.parseDouble(csvREcord.get(2));
				Persona persona = new Persona(nombre, edad, salario);
				personas.add(persona);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	@Override
	public ArrayList<Persona> listarPersonas() {
		return personas;
	}

	@Override
	public Persona buscarPersona(String nombre) {
		for (Persona persona : personas) {
			if (persona.getNombre().equalsIgnoreCase(nombre)) {
				return persona;
			}
		}
		return null;
	}

	@Override
	public boolean insertarPersona(Persona persona) {
		if (buscarPersona(persona.getNombre()) == null) {
			personas.add(persona);
			return true;
		}
		return false;	
	}

	@Override
	public boolean actualizarPersona(Persona persona) {
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getNombre().equalsIgnoreCase(persona.getNombre())) {
				personas.set(i, persona);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminarPersona(String nombre) {
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				personas.remove(i);
				return true;
			}
		}
		return false;
	}



}
