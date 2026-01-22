package ejem03_map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaTextoLarga= "Hola, bienvenido a mi aplicación de contar caracteres";
		
		//TreeMap<Character,Integer> mapaCaracteres = new TreeMap<Character,Integer>();
		LinkedHashMap<Character,Integer> mapaCaracteres = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<cadenaTextoLarga.length();i++) {
			char caracterActual = cadenaTextoLarga.charAt(i);
			if (mapaCaracteres.containsKey(caracterActual)) {
				int contadorActual = mapaCaracteres.get(caracterActual);
				mapaCaracteres.put(caracterActual, contadorActual+1);
			} else {
				mapaCaracteres.put(caracterActual, 1);
			}
		}
		for(Character clave: mapaCaracteres.keySet()) {
			System.out.println("Caracter: '"+clave+"' - Aparece: "+mapaCaracteres.get(clave)+" veces.");
		}
	}

}
