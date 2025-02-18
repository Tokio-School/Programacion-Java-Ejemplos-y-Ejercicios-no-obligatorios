import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Ejem04_MapasPersonas {
	
	public static void main(String[] args) {
		
		//TreeMap<String, Ejem03_Persona> mapa = new TreeMap<String, Ejem03_Persona>();
		HashMap<String, Ejem03_Persona> mapa = new HashMap<String, Ejem03_Persona>();
		
		mapa.put("1439A", new Ejem03_Persona("Marta"));
		mapa.put("1739A", new Ejem03_Persona("Lucas"));
		mapa.put("1939A", new Ejem03_Persona("Marcos"));
		mapa.put("0939A", new Ejem03_Persona("Juan"));
		mapa.put("1139A", new Ejem03_Persona("María"));
		mapa.put("1339A", new Ejem03_Persona("Laura"));

		for (String clave : mapa.keySet()) {
			System.out.println(clave + " -> " + mapa.get(clave));
		}
		System.out.println("*****************");
		if (mapa.containsKey("1339A")) {
			System.out.println(mapa.get("1339A").getNombre());
		} else {
			System.out.println("No existe la clave 344");
		}
		
		ArrayList<Ejem03_Persona> listaPersonas = new ArrayList<Ejem03_Persona>();
		listaPersonas.addAll(mapa.values());
		System.out.println(listaPersonas.toString());
		
		
		
		
	}

}
