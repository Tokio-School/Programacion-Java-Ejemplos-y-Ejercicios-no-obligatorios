package ejem01_interfazFuncional_java8enadelante;

public class Aplicacion {

	public static void main(String[] args) {
		/*Operacion suma=new Operacion() {

			@Override
			public double calcular(double a, double b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};*/
		Operacion suma=(double a, double b) -> {
				// TODO Auto-generated method stub
				return a+b;
		};
		System.out.println(suma.calcular(3, 4));
		
		

	}

}
