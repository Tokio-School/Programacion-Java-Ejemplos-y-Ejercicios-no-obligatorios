public class Ejemplo06  {
    class Inner {
        String greet() { return "Hola"; }
    }

    public static void main(String[] args) {
    	Ejemplo06 o = new Ejemplo06();
        Inner i = o.new Inner();
        System.out.println(i.greet());
    }
}
/**¿Qué imprime?

Opciones:
A) Hola
B) Error de compilación
C) Null
D) Nada*/