package ejem01_interfacesJava;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> ciudadesDelMundo=Stream.of("Madrid","Paris","Londres","Roma","Berlin","Atenas");
		/*ciudadesDelMundo.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});*/
		
		//ciudadesDelMundo.forEach(t->{System.out.println(t);});
		
		/*ciudadesDelMundo.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.contains("i");
			} }).forEach(t->{System.out.println(t);});*/
			
		// ciudadesDelMundo.filter(t->t.contains("i")).forEach(t->{System.out.println(t);});
		
		/*ciudadesDelMundo.map(new Function<String,Integer>(){

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}}).forEach(t->{System.out.println(t);});*/
		
		//ciudadesDelMundo.map(t->t.length()).forEach(t->{System.out.println(t);});
		
		/*Stream.generate(new Supplier<Integer>() {

			@Override
			public Integer get() {
				Random r=new Random();
				return r.nextInt();
			}}).limit(10).forEach(dato->{System.out.println(dato);});*/
		Stream.generate(() -> new Random().nextInt()).limit(10).forEach(dato->{System.out.println(dato);});
		
		BiConsumer<Integer,Integer> potencia=(a,b)->System.out.println(Math.pow(a, b));
		potencia.accept(2, 3);

	}

}
