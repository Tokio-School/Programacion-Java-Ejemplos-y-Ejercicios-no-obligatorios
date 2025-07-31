import java.util.HashMap;
import java.util.TreeMap;

public class Ejemplo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**		¿Cuál es la diferencia clave entre HashMap y TreeMap?

				Opciones:
				A) HashMap permite claves duplicadas
				B) TreeMap mantiene el orden natural de las claves
				C) TreeMap no permite valores nulos
				D) HashMap es más lento en inserciones*/
		//B) TreeMap mantiene el orden natural de las claves
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Java", 17);
		treeMap.put("Python", 3);
		treeMap.put("C++", 5);
		// Recorrrer el TreeMap
		for (String key : treeMap.keySet()) {
			System.out.println(key + " : " + treeMap.get(key));
		}
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Java", 17);
		hashMap.put("Python", 3);
		hashMap.put("C++", 5);
		// Recorrrer el HashMap
		for (String key : hashMap.keySet()) {
			System.out.println(key + " : " + hashMap.get(key));
		}
		
		
		
		
		
	}

}
