package ejem01_streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> cadenas = Stream.of("Hola", "Mundo", "Java", "Hola", "Mundo", "Java");
		Stream<String> cadenasDiferentes=cadenas.distinct();
		//System.out.println(cadenas.count());
		System.out.println(cadenasDiferentes.count());
		
		Stream<Integer> numeros=Stream.of(1,2,3,4,5,6,7,8,9,10);
		//numeros.forEach(System.out::println);
		/*numeros.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer numero) {
				// TODO Auto-generated method stub
				System.out.println(numero);
			}
		});*/
		//numeros.forEach(numero-> { System.out.println(numero); });
		//numeros.forEach(System.out::println);
		
		System.out.println("**********");
		/*List<Integer> listaNumeros=numeros.toList();
		for(Integer numero:listaNumeros) {
            System.out.println(numero);
		}*/
		/*Integer[] arrayNumeros=numeros.toArray(Integer[]::new);
		for (Integer numero : arrayNumeros) {
			System.out.println(numero);
		}*/
		
		//Set<Integer> setNumeros=numeros.collect(Collectors.toSet());
		Map<Integer,Integer> mapaNumeros=numeros.collect(Collectors.toMap(numero->numero, numero->numero*2));
		
		for (Map.Entry<Integer, Integer> entry : mapaNumeros.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		
		
		
		
	}

}
