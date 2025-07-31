
public class Ejemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * ¿Qué hace el método map() en un stream?

Opciones:
A) Filtra elementos del stream
B) Combina varios elementos en uno solo
C) Transforma cada elemento
D) Ordena el stream
 */
		// Ejemplo de uso map() en stream
		String[] palabras = {"hola", "mundo", "java"};
		String resultado = String.join(" ",
				java.util.Arrays.stream(palabras).map(p -> p.toUpperCase()).toArray(String[]::new));
		System.out.println(resultado); // Imprime: HOLA MUNDO JAVA
	}

}
