package ejem01_contandoCaracteres;

import java.util.LinkedHashMap;
import java.util.Map;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaTextoLarga= "Hola, bienvenido a mi aplicación de contar caracteres";
		
		Map<Character,Integer> mapaCaracteres = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<cadenaTextoLarga.length();i++)
		{
			Character letra=cadenaTextoLarga.charAt(i);
			mapaCaracteres.put(letra, mapaCaracteres.getOrDefault(letra, 0)+1);
		}
		for (Character letra : mapaCaracteres.keySet()) {
			System.out.println("Letra: " + letra + " Cantidad: " + mapaCaracteres.get(letra));
		}
		
		
	}

}
