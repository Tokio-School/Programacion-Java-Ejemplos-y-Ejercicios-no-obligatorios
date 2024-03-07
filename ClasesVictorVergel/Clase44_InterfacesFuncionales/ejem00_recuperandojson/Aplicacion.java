package ejem00_recuperandojson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		//FileReader reader=null;
		ArrayList<Person> lista=null;
		try (FileReader fichero = new FileReader("personas.json");){
			
			Type tipo_lista=new TypeToken<List<Person>>(){}.getType();
			lista=gson.fromJson(fichero, tipo_lista);
			for (Person persona : lista) {
				System.out.println(persona);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		
		try (FileReader fichero = new FileReader("personas2.json");){
			
			Type tipo_lista=new TypeToken<HashMap<String,Person>>(){}.getType();
			HashMap<String,Person> mapaPersonas=gson.fromJson(fichero, tipo_lista);
			
			for (Map.Entry<String, Person> entry : mapaPersonas.entrySet()) {
				System.out.println(entry.getKey()+" --- "+entry.getValue().getName()+ " --- "+entry.getValue().getAge());
			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		
		TreeSet<Person> listaOrdenada=new TreeSet<Person>(new Comparator<Person> () {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}}
		);

				
		listaOrdenada.addAll(lista);
		listaOrdenada.add(new Person("Victor",18));
		listaOrdenada.add(new Person("Victor",18));
		System.out.println(listaOrdenada);
				
				
				
		
		
	}

}
