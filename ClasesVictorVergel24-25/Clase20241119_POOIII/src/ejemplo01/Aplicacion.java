package ejemplo01;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Juan", 25);
		System.out.println(p);
		
		Persona p2= new Persona("Juan", 25);
		//p2=p;
		System.out.println(p2);
		
		if (p==p2)
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		if (p.equals(p2))
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		System.out.println("--------------");
		
		
		String cadena1="Victor";
		String cadena2="Victor";
		/*String cadena1=new String("Victor");
		String cadena2=new String("Victor");*/
		if (cadena1==cadena2)
		    System.out.println("Son iguales");
		else
		    System.out.println("No son iguales");
		if (cadena1.equals(cadena2))
		    System.out.println("Son iguales con equals");
		else
		    System.out.println("No son iguales con equals");

		
		
		
		
	}

}
