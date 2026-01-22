package ejem02_map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Aplicacion {

	public static void main(String[] args) {
		LinkedHashMap<String,Persona> mapaPersonas = new LinkedHashMap<>();
		mapaPersonas.put("C", new Persona("Maria",28));
		mapaPersonas.put("A", new Persona("Ana",30));
		mapaPersonas.put("B", new Persona("Luis",25));
		
		for(String clave: mapaPersonas.keySet()) {
			System.out.println("Clave: "+clave+" - Valor: "+mapaPersonas.get(clave));
		}
		System.out.println("------------------TreeMap-------------------");
		TreeMap<String,Persona> treeMap = new TreeMap<String,Persona>();
		treeMap.put("C", new Persona("Maria",28));
		treeMap.put("A", new Persona("Ana",30));
		treeMap.put("B", new Persona("Luis",25));
		
		for(String clave: treeMap.keySet()) {
			System.out.println("Clave: "+clave+" - Valor: "+treeMap.get(clave));
		}
		
		if (treeMap.containsKey("D")) {
			System.out.println("La clave D existe en el TreeMap");
		} else {
			System.out.println("La clave D no existe en el TreeMap");
		}
		
		
		
		

	}

}
