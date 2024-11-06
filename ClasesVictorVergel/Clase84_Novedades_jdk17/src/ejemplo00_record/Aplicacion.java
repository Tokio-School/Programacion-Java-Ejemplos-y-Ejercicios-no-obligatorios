package ejemplo00_record;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Juan", 30);
		System.out.println(p);
		System.out.println(p.nombre()+ " tiene "+p.edad()+ " años");
		
		Persona p2 = new Persona("Ana", 15);
		Persona p3 = new Persona("Juan", 30);
		if (p.equals(p3)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
	}

}
