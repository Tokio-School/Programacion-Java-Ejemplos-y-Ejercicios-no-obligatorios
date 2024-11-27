package ej03_iteraciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add("Adios");
		lista.add("Buenos dias");
		lista.add("Buenas noches");
		lista.add("Hasta luego");
		lista.add("Hasta pronto");
		
/*		for (int i = 0; i < lista.size(); i++) {
			System.out.println("--->"+i);
			System.out.println(lista.get(i));
			lista.remove(i);
        }*/
		for (String s : lista) {
			System.out.println(s);
		}
		System.out.println("------");
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("<------------->");
		//MiColeccion mc = new MiColeccion(new String[] {"Hola", "Adios", "Buenos dias", "Buenas noches", "Hasta luego", "Hasta pronto"});
		MiColeccion mc = new MiColeccion("Hola", "Adios", "Buenos dias", "Buenas noches", "Hasta luego", "Hasta pronto");
		for (String cadena : mc) {
			System.out.println(cadena);
		}
		
		
	
	
		
	}

}
