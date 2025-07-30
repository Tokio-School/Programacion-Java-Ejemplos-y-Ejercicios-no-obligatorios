import java.util.List;

public class Ejemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Java", "Python", "C++");
		list.stream()
		    .filter(s -> s.length() > 4)
		    .forEach(System.out::println);
	}
/**
 * Opciones:
A) Java
B) Java, Python
C) Python
D) Error
 */
}
