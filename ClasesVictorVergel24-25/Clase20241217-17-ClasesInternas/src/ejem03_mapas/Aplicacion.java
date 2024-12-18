package ejem03_mapas;

import java.util.HashMap;
import java.util.Map.Entry;


public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("12345678A", "Juan", "Perez", 30);
		Persona p2 = new Persona("87654321B", "Maria", "Lopez", 25);
		Persona p3 = new Persona("11223344C", "Pedro", "Garcia", 40);
		
		HashMap<String,Persona> datos = new HashMap<String,Persona>();
		datos.put(p1.dni(), p1);
		datos.put(p2.dni(), p2);
		datos.put(p3.dni(), p3);
		
		for (Entry<String, Persona> e : datos.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
		
	}
}
