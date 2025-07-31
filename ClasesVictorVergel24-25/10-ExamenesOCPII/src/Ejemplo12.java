import java.util.Optional;

public class Ejemplo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> opt = Optional.of(null);
		System.out.println(opt.orElse("Otro"));
	}
/**
 * Opciones:
A) Java
B) Otro <- Optional<String> opt = Optional.empty();
C) null
D) Error
 */
}
