package ejem_paquete_functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainFunction {

	private static final int TAMANO_MAXIMO=25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> longitudCadena = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		longitudCadena=t -> t.length();
		System.out.println(longitudCadena.apply("Hola mundo"));
		
		BiFunction<String,String,Integer> longitudCadenasConcatenadas=(a,b)->a.length()+b.length();
		System.out.println(longitudCadenasConcatenadas.apply("Hola", "Mundo"));
		
		
		System.out.println(longitudCadena.andThen(longCadena->TAMANO_MAXIMO-longCadena).apply("Hola mundo"));
		
		
		
		
	}

}
