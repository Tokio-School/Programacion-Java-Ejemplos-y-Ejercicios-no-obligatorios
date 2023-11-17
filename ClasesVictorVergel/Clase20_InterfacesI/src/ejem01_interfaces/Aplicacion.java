package ejem01_interfaces;

public class Aplicacion {

	
	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		//1ª de hacer uso del interfaz, es crear una clase que implemente el interfaz
		Entero datoEntero=new Entero();
		System.out.println(datoEntero.suma(3, 4));
		datoEntero.saludar();
		
		
		//2ª Clases anónimas.
		Sumable<Integer> calculandoEnteros=new Sumable<Integer>() {
			
			@Override
			public Integer suma(Integer dato1, Integer dato2) {
				// TODO Auto-generated method stub
				return dato1+dato2;
			}
		};
		System.out.println(calculandoEnteros.suma(6, 9));;

		
		//3ª Expresión lambda.
		/*Sumable<Integer> calculandoEnteros2=(dato1, dato2) -> {
			return dato1+dato2;
		};*/
		Sumable<Integer> calculandoEnteros2=(dato1, dato2) -> dato1+dato2;
		System.out.println(calculandoEnteros.suma(4, 55));
		
		// Referencias a un método
		Sumable<Integer> calculandoEnteros3=Sumable::suma2;
		System.out.println(calculandoEnteros3.suma(4,5));
		
	}
	
}
