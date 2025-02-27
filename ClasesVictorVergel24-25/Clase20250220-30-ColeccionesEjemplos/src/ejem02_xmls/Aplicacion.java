package ejem02_xmls;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		
		
		// NEcesitamos implementar el hascode además del equals en la clase Person.
		Set<Person> setPersonas=new HashSet<Person>();
		setPersonas.addAll(listadoPersonas);
		System.out.println(listadoPersonas.size()+"---"+ setPersonas.size());
		System.out.println("----------");
		for (Iterator iterator = setPersonas.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.getName() + " - " + person.getAge());
		}
		
	}

}
