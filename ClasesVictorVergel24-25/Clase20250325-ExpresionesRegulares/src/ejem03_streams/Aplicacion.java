package ejem03_streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		Map<String,String> prefijosPaises = new HashMap<>();
		prefijosPaises.put("34", "España");
		prefijosPaises.put("33", "Francia");
		prefijosPaises.put("44", "Reino Unido");
		prefijosPaises.put("49", "Alemania");
		prefijosPaises.put("39", "Italia");
		prefijosPaises.put("1", "Estados Unidos");
		prefijosPaises.put("7", "Rusia");
		prefijosPaises.put("86", "China");
		
		
		prefijosPaises.keySet().stream().forEach(System.out::println);
		
		/*Predicate<String> tienePrefijoValido = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return prefijosPaises.containsKey(t);
			}
		};*/
		Predicate<String> tienePrefijoValido = t->
		{
			//Matcher m = Pattern.compile("\\+\\d{1,3}").matcher(t);
			return t.matches("\\+\\d{1,3}-\\d*");
		};
		
		System.out.println(tienePrefijoValido.test("34"));
		////System.out.println(tienePrefijoValido.test("345"));
		System.out.println(tienePrefijoValido.test("3"));
		
		System.out.println("-----");
		Stream<String> telefonos = Stream.of("+34-123456789", "+-987654321", "+44-111223344","+33-899899899","+34-332123432");
		telefonos.filter(tienePrefijoValido).forEach(System.out::println);
		
		
		
		

	}

}
