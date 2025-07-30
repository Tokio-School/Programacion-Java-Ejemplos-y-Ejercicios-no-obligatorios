abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 2.0;
    double area() { return Math.PI * radius * radius; }
}

public class Ejemplo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Shape shape=new Shape() {
			@Override
            double area() {
                return 0; // Implementación vacía
            }
		};*/
		Shape s = new Circle();
		System.out.println(s.area());
	}

}
/**
 * Opciones:
A) Error de compilación
B) Error en tiempo de ejecución
C) Imprime el área del círculo
D) null*/
