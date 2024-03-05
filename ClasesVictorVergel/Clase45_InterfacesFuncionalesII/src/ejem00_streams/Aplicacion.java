package ejem00_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numeros= {1,2,3,4,5};
		Stream<Integer> stream=Stream.of(numeros);
		
		ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
		listaNumeros.add(10);
		listaNumeros.add(11);
		listaNumeros.add(12);
		listaNumeros.add(13);
		Stream<ArrayList<Integer>> streamDeLista=Stream.of(listaNumeros);
		
		stream=Stream.of(21,22,23,24,25);
		
		//Integer[] numerosDesdeColeccion=(Integer[]) stream.toArray();
		Integer[] numerosDesdeColeccion=stream.toArray(Integer[]::new);
		for (int i = 0; i < numerosDesdeColeccion.length; i++) {
			System.out.println(numerosDesdeColeccion[i]);
		}
		
		
		List<String> cadenas=Arrays.asList("casa","coche","moto","circuito");
		HashSet<String> hashSet=(HashSet<String>) cadenas.stream().collect(Collectors.toSet());
		
		for (String string : hashSet) {
			System.out.println(string);
		}
		
		
		
		List<Persona> personas=Arrays.asList(
				new Persona("Pedro","Rodriguez",12),
				new Persona("Juan","Alonso",22),
				new Persona("Maria","Gutierrez",33) /*,
				new Persona("Maria","Gutierrez",33)/*/
				);
		
		Map<String,Persona> mapaPersonas=personas
				.stream()
				.collect(Collectors.toMap(persona->persona.getNombre(),persona->persona));
		
		
		/*Map<String,Persona> mapaPersonas=personas
				.stream()
				.collect(Collectors.toMap(
						new Function<Persona, String>() {

							@Override
							public String apply(Persona persona) {
								// TODO Auto-generated method stub
								return persona.getNombre();
							}
						},
						new Function<Persona, Persona>() {

							@Override
							public Persona apply(Persona persona) {
								// TODO Auto-generated method stub
								return persona;
							}
						}));*/
		
		
		for (Map.Entry<String, Persona> person : mapaPersonas.entrySet()) {
			String key = person.getKey();
			Persona val = person.getValue();
			System.out.println(key +"->"+val);
		}
		
		
		
		
		
		
		
	}

}
