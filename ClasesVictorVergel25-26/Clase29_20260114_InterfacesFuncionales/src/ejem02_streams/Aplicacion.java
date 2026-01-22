package ejem02_streams;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		Stream<String> datos=Stream.of("Ana","Juan","Pedro","Marta","Laura","Ana","Juan");
		//System.out.println(datos.count()); 
		System.out.println(datos.distinct().count()); 
		
		Stream<Integer> numeros=Stream.of(1,2,3,4,5,6,7,8,9,10);
		/*numeros.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer dato) {
				System.out.println(dato);
			}
		});*/
		/*numeros.forEach((Integer dato) ->{
				System.out.println(dato);
		});*/
		/*numeros.forEach((Integer dato) -> System.out.println(dato));*/
		numeros.forEach(System.out::println);
		
		Stream<Double> decimales=Stream.of(2.5,3.6,4.1,5.0,7.8,8.9,9.0);
		List<Double> lista=decimales.toList();
		for(Double d:lista) {
			System.out.println(d);
		}
		System.out.println("-------------------");
		lista.stream().forEach(System.out::println);
		System.out.println("-------------------");
		System.out.println(lista.stream().count());
		
		
		Stream<Double> decimales2=Stream.of(2.52,3.62,4.12,5.02,7.82,8.92,9.02);
		//decimales2.collect(Collectors.toList()).forEach(System.out::println);
		//decimales2.collect(Collectors.toSet()).forEach(System.out::println);
		Map<Object,Object> mapaNumeros=decimales2.collect(Collectors.toMap(numero->numero
				,numero->numero*2));		
		
		for(Object clave:mapaNumeros.keySet()) {
			System.out.println("Clave: "+clave+" Valor: "+mapaNumeros.get(clave));
		}

	}

}
