package ejemplo02.clonacion;

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
		
		Persona clone=null;
		try {
			clone=(Persona) p.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("--->"+clone.toString());
		
	}

}
