import java.util.List;

public class Ejemplo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = List.of("A", "B", "C");
		lista.add("D");
		for (String s : lista) {
			System.out.println(s);
		}
	}
/**Qué imprime este código. Opciones:
A) A, B, C, D
B) Error en tiempo de compilación
C) Excepción en tiempo de ejecución
D) Nada*/
	// List.of -> devuelve una lista inmutable.
}
