
public class Ejemplo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> System.out.println("Hola desde un hilo");
        new Thread(r).start();
	}
/**
 * Opciones:
A) Hola desde un hilo
B) No imprime nada
C) Error de compilación
D) Excepción en tiempo de ejecución
 */
}
