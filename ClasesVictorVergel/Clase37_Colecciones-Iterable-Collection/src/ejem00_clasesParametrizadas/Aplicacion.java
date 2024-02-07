package ejem00_clasesParametrizadas;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto conj1=new Conjunto<Integer>(Integer.valueOf(8));
		
		Conjunto conj2=new Conjunto<String>("Victor");
		
		System.out.println(conj1);
		
		System.out.println(conj2);
		
	}

}
