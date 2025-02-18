import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Ejem03_AplicacionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> conjunto = new TreeSet<Integer>();

		conjunto.add(33);
		conjunto.add(22);
		conjunto.add(11);
		conjunto.add(44);
		conjunto.add(55);
		conjunto.add(11);
		conjunto.add(22);

	
		System.out.println("Conjunto con TreeSet");
		for (Iterator<Integer> iterator = conjunto.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		TreeSet<Ejem03_Persona> conjuntoPersonas = new TreeSet<Ejem03_Persona>();

		conjuntoPersonas.add(new Ejem03_Persona("Juan"));
		conjuntoPersonas.add(new Ejem03_Persona("Pedro"));
		conjuntoPersonas.add(new Ejem03_Persona("Lucas"));
		conjuntoPersonas.add(new Ejem03_Persona("María"));
		conjuntoPersonas.add(new Ejem03_Persona("María"));
		conjuntoPersonas.add(new Ejem03_Persona("Juan"));


	
		System.out.println("Conjunto con TreeSet de Personas");
		for (Iterator<Ejem03_Persona> iterator = conjuntoPersonas.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		
	}

}
