package ejem02_genericidad;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto<String,Integer> conjunto = new Conjunto<String,Integer>();
		conjunto.setValor1("Hola");
		conjunto.setValor2(5);
		
		System.out.println(conjunto);
		
		Conjunto<String,Integer> conjunto2 = new Conjunto<String,Integer>("hola",3);
		System.out.println(conjunto2);
		
		Conjunto<Integer,String> conjunto3 = new Conjunto<Integer,String>(3,"hola");
		System.out.println(conjunto2);
		
		
		
	}

}
