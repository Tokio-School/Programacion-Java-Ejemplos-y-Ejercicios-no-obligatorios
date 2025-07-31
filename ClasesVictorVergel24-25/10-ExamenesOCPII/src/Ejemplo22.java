import java.util.ArrayList;
import java.util.List;

public class Ejemplo22 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
        lista.add("Hola");

        procesar(lista);
    }

    public static void procesar(List<?> datos) {
        // datos.add("Mundo");
        Object primero = datos.get(0);
        System.out.println(primero);
    }

}/**
A) Compila y muestra: Hola
B) Compila, pero lanza excepción en tiempo de ejecución
C) No compila porque add no está permitido en List<?>
D) No compila porque no se puede acceder a elementos de List<?>*/
