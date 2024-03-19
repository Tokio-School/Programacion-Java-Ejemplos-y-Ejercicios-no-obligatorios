package ejem01_notacionfuncional;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// Método estático
		String cadena="Hola mundo";
		System.out.println("La cadena "+cadena+" es palindromo? "+Palindromo.esPalindromo(cadena));
		
		
		Predicate<String> esPalindromo = new Predicate<String>() {
			@Override
			public boolean test(String cadena) {
				return Palindromo.esPalindromo(cadena);
			}
		};
		Predicate<String> esPalindromo2 = (String cadena2) -> Palindromo.esPalindromo(cadena2);
		System.out.println(esPalindromo2.test("oso"));
		
		Predicate<String> esPalindromo3 = Palindromo::esPalindromo;
		System.out.println(esPalindromo3.test("oso"));
		

		//Con objetos
		Palindromo2 palindromo2 = new Palindromo2();
		Predicate<String> esPalindromo4 = palindromo2::esPalindromo;
		System.out.println(esPalindromo4.test("oso"));
		
		
		Stream.of("oso", "hola", "reconocer", "anita lava la tina")
            .filter(Palindromo::esPalindromo)
            .forEach(System.out::println);
		
		
		//Con interfaces funcionales
		Palindromo3 palindromo3 =new Palindromo3() {

			@Override
			public boolean esPalindromo33(String cadena) {
				// TODO Auto-generated method stub
				return Palindromo.esPalindromo(cadena);
			}
		};
				
		palindromo3=Palindromo::esPalindromo;
		
		System.out.println(palindromo3.esPalindromo33("oso"));
		
		
		
	}

}
class Palindromo {
	public static boolean esPalindromo(String cadena) {
		String cadenaSinEspacios=cadena.replaceAll(" ", "").toLowerCase();
		return cadenaSinEspacios.equals(new StringBuilder(cadenaSinEspacios).reverse().toString());
	}
}
class Palindromo2 {
	public boolean esPalindromo(String cadena) {
		String cadenaSinEspacios=cadena.replaceAll(" ", "").toLowerCase();
		return cadenaSinEspacios.equals(new StringBuilder(cadenaSinEspacios).reverse().toString());
	}
}

@FunctionalInterface
interface Palindromo3 {
	public boolean esPalindromo33(String cadena);
}