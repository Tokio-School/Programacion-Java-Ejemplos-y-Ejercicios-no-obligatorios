package ejem04_stream;

import java.util.stream.Stream;

public class Apliacion {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Java", "Python", "JavaScript", "C#", "Ruby");
		StringBuilder resultado=stream.collect(StringBuilder::new, (sb, s) -> sb.append(s).append(" "), StringBuilder::append);
		System.out.println(resultado);
		

	}

}
