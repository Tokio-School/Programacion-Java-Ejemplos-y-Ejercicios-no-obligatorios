import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Aplicacion2 {
	public static void main(String[] args) {
		/*Consumer<Integer> potencias=new Consumer<Integer>() {

			@Override
			public void accept(Integer numero) {
				 System.out.println(Math.pow(numero, 2));
			}
		};*/
		Consumer<Integer> potencias=numero -> System.out.println("->"+Math.pow(numero, 2));

		potencias.accept(5);
		for (int i=1;i<=10;i++) {
			potencias.accept(i);
		}
		System.out.println("---");
		Consumer<Integer> potenciaDePotencias=potencias.andThen(numero -> System.out.println("-->"+Math.pow(numero, 2)));
		potenciaDePotencias.accept(3);
		//Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(potenciaDePotencias);
		
		BiConsumer<Integer, Integer> potencia=(base,exponente) -> System.out.println(Math.pow(base, exponente));
		potencia.accept(3, 4);

	}
}
