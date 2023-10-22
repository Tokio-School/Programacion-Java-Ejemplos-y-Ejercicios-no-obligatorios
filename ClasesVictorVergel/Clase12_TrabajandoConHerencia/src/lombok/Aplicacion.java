package lombok;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona prueba=new Persona();
		Persona pepe=new Persona(123,33,"Pepe","","",true);
		System.out.println(pepe.getNombre());
		System.out.println(pepe);
		
		
		Persona pepe2=new Persona(123,33,"Pepe","","",true);
		
		//if (pepe2==pepe)
		if (pepe2.equals(pepe))
			System.out.println("Son la misma persona");
		else
			System.out.println("No son la misma persona");
		
		
		
		pepe.estasVivo();
		
		Animal gatito=new Animal();
		gatito.estasVivo();
		
		
	}

}
