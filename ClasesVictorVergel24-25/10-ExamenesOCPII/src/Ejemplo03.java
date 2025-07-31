import java.util.stream.Stream;

public class Ejemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::print);
		stream.forEach(System.out::print);

		/*¿Qué sucede?

		Opciones:
		A) abcabc
		B) abc
		C) Error
		D) Excepción en tiempo de ejecución*/
	}

}
