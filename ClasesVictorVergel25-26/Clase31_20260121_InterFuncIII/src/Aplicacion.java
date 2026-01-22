import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BinaryOperator;import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		/*Stream<Integer> numeros=Stream.iterate(2, new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer numero) {
				// TODO Auto-generated method stub
				return numero+2;
			}
		});*/
		Stream<Integer> numeros=Stream.iterate(2, numero-> numero+2).limit(10);
		numeros.forEach(System.out::println);
		
		/*Stream<String> identificadores=Stream.generate(new Supplier<String>() {
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return UUID.randomUUID().toString();
			}
		});*/
		Stream<String> identificadores=Stream.generate(()->UUID.randomUUID().toString());

		identificadores.limit(5).forEach(System.out::println);
		
		
		
		//Stream<String> ciudades=Stream.of("Madrid","Barcelona","Valencia","Sevilla","Zaragoza");
		Stream<String> ciudades=Stream.of(null,null,null);
		/*ciudades.reduce(new BinaryOperator<String>() {

			@Override
			public String apply(String dato1, String dato2) {
				// TODO Auto-generated method stub
				return dato1+"-"+dato2;
			}
		});*/
		Optional<String> todasCiudades=ciudades.reduce((dato1,dato2)-> dato1+"-"+dato2);
		System.out.println(todasCiudades.get()); 
		todasCiudades.ifPresent(System.out::println);
		
		
		List<List<Integer>> listaNumeros=Arrays.asList(
				Arrays.asList(1,2,3,11,12,13,22),
				Arrays.asList(1,2,3,11,12,13,22),
				Arrays.asList(7,8,9,55,99)
				);
		
		/*for (List<Integer> lista : listaNumeros) {
			for (Integer numero : lista) {
				System.out.println(numero);
			}
		}*/
		
		
		/*listaNumeros.stream().flatMap(new Function<List<Integer>, Stream<Integer>>() {

			@Override
			public Stream<Integer> apply(List<Integer> lista) {
				// TODO Auto-generated method stub
				return lista.stream();
			}
		}).forEach(System.out::println);*/
		listaNumeros.stream().flatMap(lista -> lista.stream()).distinct().forEach(System.out::println);

		
		
		
		
		
		

	}

}
