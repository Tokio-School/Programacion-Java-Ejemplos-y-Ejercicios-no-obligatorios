package ejem01_function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Function<String,Integer> longitudCadena= new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}

		};*/
		Function<String,Integer> longitudCadena=t ->t.length(); 
		System.out.println(longitudCadena.apply("Hola"));
		System.out.println(longitudCadena.apply("mundo"));
		
		/*BiFunction<String,String,Integer> longitudCadenas=new BiFunction<String,String,Integer>() {

			@Override
			public Integer apply(String t, String u) {
				// TODO Auto-generated method stub
				return (t+u).length();
			}
		};*/
		
		BiFunction<String,String,Integer> longitudCadenas=(cadena1,cadena2)->(cadena1+cadena2).length();
		
		System.out.println(longitudCadenas.apply("Hola", "mundo"));
		
		
		Stream<Persona> personas = Stream.of(
				new Persona("Ju0an","Rodriguez",33),
				new Persona("Marcos","Alonso",22),
				new Persona("Ma0ría","Gutierrez",18),
				new Persona("Victor","Vergel",21)
				);

		System.out.println("-----");
		//personas.map(p->(p.getNombre()).length()).forEach(System.out::println);
		/*Predicate<String> nombreCorrecto=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return !t.contains("0");
			}
		};*/
		Predicate<String> nombreCorrecto=nombre->!nombre.contains("0");
		Persona juan=new Persona("Juan","Rodriguez",33);
		System.out.println(nombreCorrecto.test(juan.getNombre()));
		
		//personas.filter(persona->!persona.getNombre().contains("0")).forEach(System.out::println);
		//personas.map(persona->persona.getNombre()).filter(nombre->!nombre.contains("0")).forEach(System.out::println);
		
		Predicate<String> nombreCorrecto2=nombreCorrecto.and(nombre->nombre.length()>3);
		System.out.println("------------");
		System.out.println(nombreCorrecto2.test("Ju0an"));
		
		
		Predicate<String> nombreCorrectoTamano=nombre->nombre.length()>3;
		personas.map(persona->persona.getNombre()).filter(nombreCorrecto.and(nombreCorrectoTamano)).forEach(System.out::println);
		
		
	}

}
