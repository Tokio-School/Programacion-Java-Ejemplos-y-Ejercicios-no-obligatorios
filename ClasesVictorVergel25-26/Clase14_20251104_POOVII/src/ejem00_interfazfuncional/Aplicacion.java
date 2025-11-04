package ejem00_interfazfuncional;

public class Aplicacion {

	public static void main(String[] args) {
		MiNumero num1 = new MiNumero(10);
		System.out.println(num1.sumar(5));
		
		
		Sumable otroNumero=new Sumable() {
			@Override
			public int sumar(int a) {
				return a+a;
			}
		};
		
		System.out.println(otroNumero.sumar(5));
		
		Sumable otroNumeroConLambda=(dato) -> dato + dato;
		System.out.println(otroNumeroConLambda.sumar(7));
		
		
		
		
		
		
		
	}

}
