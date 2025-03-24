package ejem03_ejemplos;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> palindromo = (texto) -> Palindromo.esPalindromo(texto);
		System.out.println(palindromo.test("Anita lava la tina"));
		System.out.println(palindromo.test("prueba"));
		
		
		
		
		Stream.of("Anita lava la tina", "prueba", "oso", "reconocer").filter(palindromo).forEach(palind->System.out.println(palind));
		
		
		
	}

}
class Palindromo{
	
	public static boolean esPalindromo(String texto) {
		String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
		return new StringBuilder(textoLimpio).reverse().toString().equals(textoLimpio);
	}
}