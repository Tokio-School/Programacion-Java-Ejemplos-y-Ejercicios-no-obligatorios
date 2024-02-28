package ejem00_xmls;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persona=new Person();
		//System.out.println("Hola Mundo");
		//File fichero=new File("personas.xml");
		
		Serializer serializer=new Persister();
		InputStream fichero=ClassLoader.getSystemResourceAsStream("personas.xml");
		
		Persons personas=null;
		try {
			personas=serializer.read(Persons.class, fichero);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Person> listadoPersonas=personas.getPersons();
		
		listadoPersonas.add(new Person("Victor",18));
		
		for (Person person : listadoPersonas) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
		
		File salidaDatos=new File("datos_exportados.xml");
		Serializer serializer2=new Persister();
		Persons personas2=new Persons(listadoPersonas);
		try {
			serializer2.write(personas2, salidaDatos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
