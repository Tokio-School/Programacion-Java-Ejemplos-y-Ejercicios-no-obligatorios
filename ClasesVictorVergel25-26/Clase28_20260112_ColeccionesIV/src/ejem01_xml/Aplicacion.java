package ejem01_xml;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.Serializer;

public class Aplicacion {

	public static void main(String[] args) {
		InputStream fichero=ClassLoader.getSystemResourceAsStream("personas.xml");
		Serializer serializador=new Persister();
		
		Personas personas=null;
		try {
			personas=serializador.read(Personas.class, fichero);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Persona> listaPersonas=personas.getPersonas();
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
		listaPersonas.add(new Persona("Pepito",28));
		listaPersonas.add(new Persona("Anita",22));
		
		Serializer serializador2=new Persister();
		File salidaDatos=new File("personas_modificadas.xml");
		Personas personas2=new Personas(listaPersonas);
		try {
			serializador2.write(personas2, salidaDatos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---- PERSONAS ORDENADAS POR NOMBRE (USANDO TREESET) ----");
		
		Set<Persona> setPersonas=new TreeSet<Persona>(listaPersonas);
		
 		for(Iterator<Persona> punteroAPersona=setPersonas.iterator();punteroAPersona.hasNext();) {
 			Persona persona=punteroAPersona.next();
 			System.out.println(persona);
 		}
 		

	}

}
