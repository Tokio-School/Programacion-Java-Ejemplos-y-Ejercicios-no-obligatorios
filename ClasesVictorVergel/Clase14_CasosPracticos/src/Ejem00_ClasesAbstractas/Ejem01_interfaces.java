package Ejem00_ClasesAbstractas;

interface  FiguraGeometrica2 {
    double calcularArea();
    double calcularPerimetro();
}

class Circulo2 implements FiguraGeometrica2 {
    private double radio;

    public Circulo2(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Triangulo2 implements FiguraGeometrica2 {
    private double base;
    private double altura;

    public Triangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Implementar cálculo del perímetro de un triángulo
        return 0;
    }
    
    
  
    
}

class Ejem01_interfaces 
{
	public void main(String args[])
	{
		Circulo2 cir=new Circulo2(0);
		FiguraGeometrica2 fg=new FiguraGeometrica2() {
			
			@Override
			public double calcularPerimetro() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double calcularArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		} ;
	}
}




