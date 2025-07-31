class A {
    private int x = 10;
}

class B extends A {
    void print() {
        System.out.println(x);
    }
}
/**
Opciones:
A) Imprime 10
B) Imprime 0
C) Error en tiempo de compilación 
D) Compila pero lanza excepción
*/
//No compoila por ser privado