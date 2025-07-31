import java.util.HashMap;
import java.util.Map;

public class Ejemplo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 17);
		map.put("Python", 3);
		System.out.println(map.get("Java"));
	}

}
/**
 * Opciones:
A) 17
B) Java
C) null
D) Error de compilación*/
