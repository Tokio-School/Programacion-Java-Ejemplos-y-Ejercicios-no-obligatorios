package ejem02_hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IndicePropio indice1=new IndicePropio("seis");
		IndicePropio indice2=new IndicePropio("seis");
		System.out.println(indice1.hashCode()+" - "+indice2.hashCode()+ " - "+indice1.equals(indice2));
		
		
		Map<IndicePropio,Integer> mapa=new TreeMap<IndicePropio, Integer>();
		mapa.put(new IndicePropio("uno"), 1);
		mapa.put(new IndicePropio("dos"), 2);
		mapa.put(new IndicePropio("tres"), 3);
		mapa.put(new IndicePropio("cuatro"), 4);
		mapa.put(new IndicePropio("cinco"), 5);
		mapa.put(indice1, 6);
		mapa.put(indice2, 6);
		
		Set<Map.Entry<IndicePropio,Integer>> entradasSet= mapa.entrySet();
		for (Map.Entry<IndicePropio, Integer> entry : entradasSet) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
			//System.out.println(entry.getKey()+" - "+mapa.get(entry.getKey()));
		}
		
		/*System.out.println(mapa.get("uno"));
		
		List<IndicePropio> lista=new ArrayList<IndicePropio>();
		Collections.addAll(lista, mapa.keySet().toArray(new IndicePropio[0]));
		for (IndicePropio indicePropio : lista) {
			System.out.println(indicePropio);
		}*/
		
		
	}

}
