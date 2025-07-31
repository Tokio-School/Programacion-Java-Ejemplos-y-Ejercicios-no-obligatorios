import java.util.function.Function;

public class Ejemplo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ¿Qué hace esta expresión lambda?
		Opciones:
		A) 3
		B) 4
		C) "Java"
		D) Error*/
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Java"));
		
			
		
	}

}
