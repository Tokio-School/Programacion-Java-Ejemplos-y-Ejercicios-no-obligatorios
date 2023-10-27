package Ejem04_ClasesAbstractas;

abstract class FiguraGeometrica {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    double calcularPerimetro() {
        // Implementar cálculo del perímetro de un triángulo
        return 0;
    }
}
