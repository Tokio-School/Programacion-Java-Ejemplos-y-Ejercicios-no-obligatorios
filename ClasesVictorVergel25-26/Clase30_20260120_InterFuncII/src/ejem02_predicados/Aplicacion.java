package ejem02_predicados;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		/*Predicate<String> nombreCorrecto=new Predicate<String>() {

			@Override
			public boolean test(String nombre) {
				return !nombre.contains("0");
			}
		};*/
		Predicate<String> nombreCorrecto=nombre -> !nombre.contains("0");
		Stream<Usuario> usuarios=Stream.of(
				new Usuario(1,"Ana"),
				new Usuario(2,"Pe0dro"),
				new Usuario(3,"Luis"),
				new Usuario(4,"Marta0"),
				new Usuario(5,"Lucia")
				);
		//usuarios.filter(u->nombreCorrecto.test(u.getNombre())).forEach(usuarioFiltrado -> System.out.println(usuarioFiltrado));
		/*boolean algunoConMasDe4Caracteres=usuarios.anyMatch(new Predicate<Usuario>() {
			@Override
			public boolean test(Usuario u) {
				return u.getNombre().length()>4;
			}
		});
		System.out.println(algunoConMasDe4Caracteres);
		*/
		/*boolean todosConMasDe4Caracteres=usuarios.allMatch(new Predicate<Usuario>() {
			@Override
			public boolean test(Usuario u) {
				return u.getNombre().length()>4;
			}
		});*/
		//boolean todosConMasDe4Caracteres=usuarios.allMatch(usuario -> usuario.getNombre().length()>4);

		/*usuarios.filter(usuario -> usuario.getNombre().length()>4)
		        .forEach(usuarioFiltrado -> System.out.println(usuarioFiltrado));
		
		System.out.println(todosConMasDe4Caracteres);*/
		
		
		/*usuarios.map(usuario -> usuario.getNombre().length()>4)
				.forEach(System.out::println)
				.filter(nombreCorrecto);*/
		/*usuarios.filter(usuario -> usuario.getNombre().length()>4).
				forEach(System.out::println);*/
		usuarios.filter(usuario -> usuario.getNombre().length()>4)
				.filter(usuario -> nombreCorrecto.test(usuario.getNombre()))
				.forEach(System.out::println);
		

	}

}
