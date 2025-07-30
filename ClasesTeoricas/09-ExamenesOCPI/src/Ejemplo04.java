import java.util.ArrayList;
import java.util.List;

class A {
    public String toString() { return "A"; }
}

class B extends A {
    public String toString() { return "B"; }
}

public class Ejemplo04 {
    public static void main(String[] args) {
        A obj = new B();
		if (obj instanceof B) {
			System.out.println("Es una instancia de B");
		} else {
			System.out.println("No es una instancia de A");
		}
        System.out.println(obj);
        //List<A> lista = new ArrayList<>();
    }
}
/*
 * Opciones:
A) A
B) B
C) Error de compilación
D) Null
*/
