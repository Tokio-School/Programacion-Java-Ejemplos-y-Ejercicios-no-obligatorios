import java.util.List;

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Ana", "Luis", "Marta");
		long count = names.stream()
		                  .filter(n -> n.length() > 3)
		                  .count();
		System.out.println(count);
	}
	/**
	 * Opciones:
A) 0
B) 1
C) 2
D) 3
	 */

}
