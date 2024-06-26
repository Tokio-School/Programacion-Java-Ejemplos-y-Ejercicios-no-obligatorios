package DAO_Implementacion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import dao_interface.DAO_Persona;
import modelo.Persona;

public class DAO_Persona_CSV implements DAO_Persona {

	
	
	ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
	
	
	public DAO_Persona_CSV() {
		super();
		
		ClassLoader classLoader = getClass().getClassLoader();
		try (FileReader fr = new FileReader(classLoader.getResource("Personas.csv").getFile());
			CSVParser csv= new CSVParser(fr, CSVFormat.DEFAULT);)
		{
			for(CSVRecord csvRecord : csv) {
                String nombre=csvRecord.get(0);
                int edad=Integer.parseInt(csvRecord.get(1));
                double salario=Double.parseDouble(csvRecord.get(2));
                Persona persona= new Persona(nombre, edad, salario);
                listaPersonas.add(persona);
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
	public void borrar(Persona persona) {
		// TODO Auto-generated method stub
		listaPersonas.remove(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		for (Persona persona2 : listaPersonas) {
			if (persona2.getNombre().equals(persona.getNombre())) {
				persona2.setEdad(persona.getEdad());
				persona2.setSalario(0);
			}
		}
	}

	@Override
	public Persona buscarPorId(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public void guardar()
	{
		try (FileWriter fw = new FileWriter("src/main/resources/Personas.csv");
			 CSVPrinter printer = new CSVPrinter(fw,CSVFormat.DEFAULT);)
			{
				for (Persona persona : listaPersonas) {
					printer.printRecord(persona.getNombre(), persona.getEdad(), persona.getSalario());
				}
				printer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
