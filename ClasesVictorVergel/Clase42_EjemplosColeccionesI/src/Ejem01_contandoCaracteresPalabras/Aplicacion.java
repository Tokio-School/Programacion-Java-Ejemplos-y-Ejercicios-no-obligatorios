package Ejem01_contandoCaracteresPalabras;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaTexto="Lorem ipsum dolor sit amet, consectetur adipiscing elit. "+
				"Suspendisse laoreet odio nibh. Donec dictum eros ac magna luctus, non "+
				"suscipit ipsum iaculis. Vestibulum ac eros sit amet sapien auctor dapibus sit amet in nisi. Donec sed dignissim felis. Cras tempor sodales nisl et bibendum. Nullam vel convallis turpis. Donec tempus est vitae nibh ullamcorper dignissim. Donec sollicitudin dolor erat, cursus auctor ligula consequat sit amet. Duis facilisis dignissim lorem.";
		
		cadenaTexto=cadenaTexto.replace("[,. ]", "");
		
		Map<Character,Integer> conteo=new LinkedHashMap<Character,Integer>();
		
		for (char letra : cadenaTexto.toLowerCase().toCharArray()) {
			conteo.put(letra, conteo.getOrDefault(letra, 0)+1);
		}
		
		
		conteo=ordenaPorValor(conteo);
		
		for (Map.Entry<Character, Integer> entry : conteo.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+" : "+val);
		}

	}

	private static Map<Character, Integer> ordenaPorValor(Map<Character, Integer> conteo) {
		// TODO Auto-generated method stub
		List<Map.Entry<Character,Integer>> list=new LinkedList<>(conteo.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();
			}
			
		});
		
		Map<Character,Integer> resultado=new LinkedHashMap<Character, Integer>();
		for (Entry<Character, Integer> entry : list) {
			resultado.put(entry.getKey(), entry.getValue());
		}
		return resultado;
	}

}
