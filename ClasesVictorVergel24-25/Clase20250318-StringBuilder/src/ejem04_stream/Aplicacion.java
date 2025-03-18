package ejem04_stream;

import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		Stream<String> streamCadenas=Stream.of("ho","la","mundo","adios","mundo");
		
		/*StringBuilder resultado=streamCadenas.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(resultado);*/
		
		
		StringBuilder resultado=streamCadenas
				.filter(s->s.length()>2)
				.collect(StringBuilder::new, (sb,s)->sb.append(s), StringBuilder::append);
		System.out.println(resultado);
		
		

	}

}
