import java.util.function.Consumer;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
		stream.limit(2).forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		stream.limit(2).forEach(s -> System.out.println(s));
		stream.limit(2).forEach(System.out::println);
		
		
	}

}
