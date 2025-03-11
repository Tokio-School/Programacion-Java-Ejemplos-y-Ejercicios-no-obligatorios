import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stream<Integer> numeros = Stream.iterate(5, new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer numero) {
				// TODO Auto-generated method stub
				return numero+1;
			}
		})*/;
		Stream<Integer> numeros =Stream.iterate(5,numero->numero+1).limit(20);
		//numeros.forEach(System.out::println);
		numeros.forEach(cadena->System.out.println(cadena));
		
/*		Stream<String> identificador = Stream.generate(new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return UUID.randomUUID().toString();
			}
		});*/
		Stream<String> identificador = Stream.generate(()->UUID.randomUUID().toString()).limit(20);
		identificador.forEach(System.out::println);
		
		
		Stream<String> ciudades=Stream.of("Madrid","Barcelona","Valencia","Sevilla");
		//Stream<String> ciudades=Stream.of(null,null,null,null);
		/*Optional<String> cadenaCiudades= ciudades.reduce(new BinaryOperator<String>() {

			@Override
			public String apply(String cadena1, String cadena2) {
				// TODO Auto-generated method stub
				return cadena1+", "+cadena2;
			}
		});*/
		/*Optional<String> cadenaCiudades= ciudades.reduce((cadena1,cadena2)->cadena1+", "+cadena2);
		
		System.out.println(cadenaCiudades.get());
		cadenaCiudades.ifPresent(System.out::println);*/
		
		List<List<Integer>> listaNumeros = Arrays.asList(
				Arrays.asList(3, 2, 3), Arrays.asList(4, 3, 6), Arrays.asList(7, 8, 9));

		
		//listaNumeros.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);
		/*listaNumeros.stream().flatMap(new Function<List<Integer>, Stream<Integer>>() {

			@Override
			public Stream<Integer> apply(List<Integer> lista) {
				// TODO Auto-generated method stub
				return lista.stream();
			}
		}).collect(Collectors.toList()).forEach(System.out::println);*/
		
		//listaNumeros.stream().flatMap(List::stream).distinct().forEach(System.out::println);
		//System.out.println(listaNumeros.stream().flatMap(List::stream).distinct().count());
		System.out.println("-------------");
		Stream.concat(listaNumeros.stream().flatMap(List::stream).distinct(),ciudades ).forEach(System.out::println);
		
		
		
	}

}
