package ejem01_set;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Elemento 1");
		lista.add("Elemento 1");
		
		Set<String> conjunto = new java.util.HashSet<String>(lista);
		System.out.println("Tamaño de la lista: " + conjunto.size());
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		System.out.println("----- Conjunto ordenado -----");
		TreeSet<String> conjuntoOrdenado = new TreeSet<String>();
		conjuntoOrdenado.add("María");
		conjuntoOrdenado.add("Ana");
		conjuntoOrdenado.add("Juan");
		
		for (String elemento : conjuntoOrdenado) {
			System.out.println(elemento);
		}
		
		
		System.out.println("----- Conjunto Persona ordenado -----");
		TreeSet<Persona> conjuntoOrdenadoPersona = new TreeSet<Persona>();
		conjuntoOrdenadoPersona.add(new Persona("María",88));
		conjuntoOrdenadoPersona.add(new Persona("María",89));
		conjuntoOrdenadoPersona.add(new Persona("Ana",13));
		conjuntoOrdenadoPersona.add(new Persona("Juan",45));
		conjuntoOrdenadoPersona.add(new Persona("Juan",45));
		
		for (Persona elemento : conjuntoOrdenadoPersona) {
			System.out.println(elemento);
		}
		System.out.println("Tamaño del conjunto de personas: " + conjuntoOrdenadoPersona.size());
		
	}

}
