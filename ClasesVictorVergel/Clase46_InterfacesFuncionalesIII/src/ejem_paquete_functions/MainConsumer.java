package ejem_paquete_functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Consumer<Integer> potencias=new Consumer<Integer>() {

			@Override
			public void accept(Integer num) {
				// TODO Auto-generated method stub
				System.out.println("El cuadrado de "+num+" es "+(num*num));
			}
			
		};*/
		Consumer<Integer> potencias= num -> System.out.println("El cuadrado de "+num+" es "+(num*num));
		potencias.accept(5);
		
	/*	for (int i = 0; i < 10; i++)
			potencias.accept(i);*/
		
		
		potencias.andThen(potencias).accept(3);
		
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9,10);
		stream.forEach(potencias);
		
		
		
		BiConsumer<Integer, Integer> potencias2= (num, exp) -> System.out.println("La potencia de "+num+" elevado al exponente "+exp+ " es "+Math.pow(num, exp));
		potencias2.accept(2, 3);
		potencias2.accept(3, 2);
		potencias2.accept(4, 2);
		
		
		
		
	}

}
