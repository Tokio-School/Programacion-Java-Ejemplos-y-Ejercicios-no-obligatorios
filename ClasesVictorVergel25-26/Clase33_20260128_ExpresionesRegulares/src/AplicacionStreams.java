import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AplicacionStreams {

	public static void main(String[] args) {
		Map<String,String> mapa = new HashMap<>();
		mapa.put("34","España");
		mapa.put("33","Francia");
		mapa.put("39","Italia");
		mapa.put("41","Suiza");
		mapa.put("44","Reino Unido");
		mapa.put("1","Estados Unidos");
		mapa.put("49","Alemania");

		/*Predicate<String> tienePrefijo=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};*/
		/*Predicate<String> tienePrefijo=t->mapa.containsKey(t);
		System.out.println(tienePrefijo.test("34"));*/
		Predicate<String> tienePrefijoValido=t-> t.matches("\\d{1,2}-\\d*");
		/*System.out.println(tienePrefijoValido.test("34"));
		System.out.println(tienePrefijoValido.test("344"));
		System.out.println(tienePrefijoValido.test("3.4"));*/
		
		Stream<String> streamPrefijos=Stream.of("3444-666777888","33-123456789","-8001234567","49-987654321");
		streamPrefijos.filter(tienePrefijoValido).forEach(System.out::println);
		
		
		
	}

}
