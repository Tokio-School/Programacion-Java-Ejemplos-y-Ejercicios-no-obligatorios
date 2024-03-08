package ejem_paquete_functions;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class MainPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> usuarioValido = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				
				return Pattern.compile("[a-zA-Z]+").matcher(t).matches();
			}
		};
		
		usuarioValido = (String t) -> Pattern.compile("[a-zA-Z]+").matcher(t).matches();
		System.out.println(usuarioValido.test("VictorVergel"));
		System.out.println(usuarioValido.test("VictorVergel1"));
		
		
		/*System.out.println(usuarioValido.and(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 8;
			}
		}).test("Victor"));*/
		
		System.out.println(usuarioValido.and(t -> t.length() > 8).and(t->t.length()<15).test("Vasdf"));
		
		
		
		//System.out.println(usuarioValido.or(t -> t.equalsIgnoreCase("@dmin")).test("@dmin"));
		//System.out.println(usuarioValido.   ..is   ("@dmin")).test("@dmin");
		
		
		Stream nombres=Stream.of("M7aria","Pe7dro","J uan","A na","Vic+tor");
		nombres.filter(usuarioValido).forEach(nombre-> System.out.println(nombre));
		
		
	}

}
