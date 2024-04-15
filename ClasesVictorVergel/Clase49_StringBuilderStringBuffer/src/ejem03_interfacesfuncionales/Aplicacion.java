package ejem03_interfacesfuncionales;

import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.function.BiConsumer;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> streamCadenas=Stream.of("uno","dos","tres","cuatro","cinco");
		
		
		
		/*		streamCadenas
				.map(cadena->cadena.toUpperCase())
				//.map(String::toUpperCase)
				.filter(cadena->cadena.length()>3)
				.forEach(System.out::println);*/
		
		StringBuilder resultado2=
				streamCadenas
				.map(cadena->cadena.toUpperCase())
				//.map(String::toUpperCase)
				.filter(cadena->cadena.length()>3)
				.collect(new Supplier<StringBuilder>() {
					@Override
                    public StringBuilder get() {
                        return new StringBuilder();
                    }
                },new BiConsumer<StringBuilder, String>() {
                	                    @Override
                    public void accept(StringBuilder t, String u) {
                        t.append(u);
                    }
                }, new BiConsumer<StringBuilder, StringBuilder>() {
                    @Override
                    public void accept(StringBuilder t, StringBuilder u) {
                        t.append(u);
                    }
                });
                
				//.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		
	    System.out.println(resultado2);
		
		
		
	}

}
