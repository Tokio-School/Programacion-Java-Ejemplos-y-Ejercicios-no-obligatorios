package ejem03_claseinternaconinterfaces;

public class Aplicacion {
	
	private int dato=33;
	
	public static void main (String args[])
	{
		OperacionMatematica calculadora=new OperacionMatematica() {
			public double ejecutar(double a, double b) {
				return a+b;
			}
		};
		System.out.println(calculadora.ejecutar(3, 4));
		
		
		OperacionMatematica calculadora2=(a, b) ->  a+b;
		System.out.println(calculadora2.ejecutar(3, 4));
		
		
		OperacionMatematica calculadoraRestas=new OperacionMatematica() {
			public double ejecutar(double a, double b) {
				return a-b;
			}
		};
		
		System.out.println(calculadoraRestas.ejecutar(3, 4));
		
		AplicacionCalculadora miOtraCalculadora=new Aplicacion.AplicacionCalculadora();
		System.out.println(miOtraCalculadora.ejecutar(3,7));
		
		System.out.println(new Aplicacion().dato);
	}
	

	public static class AplicacionCalculadora implements OperacionMatematica {

		@Override
		public double ejecutar(double a, double b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	
	
}
