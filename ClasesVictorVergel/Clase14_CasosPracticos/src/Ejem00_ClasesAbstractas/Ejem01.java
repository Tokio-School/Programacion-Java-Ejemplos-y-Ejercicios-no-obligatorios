package Ejem00_ClasesAbstractas;

abstract class FiguraGeometrica {
    abstract double calcularArea();
    double calcularPerimetro() {
    	System.out.println("implementación de método");
    	return 0;
    };
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

class Ejem01 
{
	public void main(String args[])
	{
		Circulo cir=new Circulo(0);
		FiguraGeometrica fg=new FiguraGeometrica() {
			
			@Override
			double calcularPerimetro() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			double calcularArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}




