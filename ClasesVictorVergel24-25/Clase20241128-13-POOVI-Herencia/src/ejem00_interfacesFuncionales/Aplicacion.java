package ejem00_interfacesFuncionales;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		char letra='a';
		
		Integer miNumero=Integer.valueOf(3);
		System.out.println(a*miNumero);
		Double miNumero2=Double.valueOf(3.0);
		System.out.println(a*miNumero2);
		Boolean miBooleano=Boolean.valueOf(true);
		
		
		
		MiNumeroEntero miNumeroEntero = new MiNumeroEntero();
		System.out.println("La suma de 3 y 2 es:"+miNumeroEntero.suma(3, 2));
		System.out.println("La multiplicación de 3 y 2 es:"+Sumable.multiplica(3, 2));
		miNumeroEntero.informacion();
		
		Sumable objetoSumable = new Sumable() {

			@Override
			public int suma(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		};
		
		
		Sumable objetoSumable2 = (int x, int y) -> x+y;
		objetoSumable2.informacion();
		System.out.println("La suma de 3 y 2 es:"+objetoSumable2.suma(3, 2));
		
		
		
	}

}
