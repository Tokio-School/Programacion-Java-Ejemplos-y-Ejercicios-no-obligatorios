package ejem02_masejemplosLambda;

public class Aplicacion {

	public static void main(String[] args) {
		/*Operacion suma=new Operacion() {

			@Override
			public int operar(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}};*/
		Operacion suma=(a,b)-> a+b;
		suma.metodoDefault();
		Operacion multiplicacion=(a,b)-> a*b;
		Operacion resta=(a,b)-> a-b;
		Operacion division=(a,b)-> a/b;
		
		System.out.println(suma.operar(5, 3));
		System.out.println(multiplicacion.operar(5, 3));
		System.out.println(resta.operar(5, 3));
		System.out.println(division.operar(6, 3));
		
		System.out.println(3/0);

	}

}
