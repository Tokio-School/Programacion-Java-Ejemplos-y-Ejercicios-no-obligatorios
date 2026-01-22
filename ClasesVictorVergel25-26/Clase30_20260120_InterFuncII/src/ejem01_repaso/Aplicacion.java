package ejem01_repaso;

import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

public class Aplicacion {

	public static void main(String[] args) {
		/*IntConsumer mostrarEdad= new IntConsumer() {

			@Override
			public void accept(int value) {
				System.out.println("La edad es: "+value);
			}
		};*/
		/*IntConsumer mostrarEdad=(int value) ->{
				System.out.println("La edad es: "+value);
		};*/
		IntConsumer mostrarEdad= edad -> System.out.println("La edad es: "+edad);
		mostrarEdad.accept(25);
		
		
		/*IntToDoubleFunction mitad=new IntToDoubleFunction() {

			@Override
			public double applyAsDouble(int value) {
				return value/2.0;
			}
		};*/
		IntToDoubleFunction mitad=dato -> dato/2.0;

		System.out.println(mitad.applyAsDouble(10));
		
		IntStream.rangeClosed(1, 10).forEach(value ->System.out.println(value)); 
		List<Usuario> usuarios=IntStream.of(101,102,103).mapToObj(value -> new Usuario(value)).toList();
		//Stream<Integer> stream=Stream.of(101,102,103);

	}

}
