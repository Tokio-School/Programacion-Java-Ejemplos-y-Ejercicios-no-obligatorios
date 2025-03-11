import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Aplicacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> potencias=numero->System.out.println(Math.pow(numero, 2));
		/*for (int i = 0; i < 10; i++) {
			potencias.accept(i);
		}*/
		//potencias.andThen(potencias).accept(3);
	        Consumer<Integer> potenciaDePotencia = potencias.andThen(numero -> 
	            System.out.println("Potencia de la potencia: " + Math.pow(Math.pow(numero, 2), 2))
	        );
		Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(potencias);
		
		
		BiConsumer<Integer,Integer> potencia=(num1,num2)->System.out.println(Math.pow(num1, num2));
		potencia.accept(2,3);
		
		
		
		
	}

}
