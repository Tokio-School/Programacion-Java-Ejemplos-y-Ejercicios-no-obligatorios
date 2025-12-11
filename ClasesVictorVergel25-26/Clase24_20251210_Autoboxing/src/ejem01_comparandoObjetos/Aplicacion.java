package ejem01_comparandoObjetos;

public class Aplicacion {

	public static void main(String[] args) {
		int enteroPrimitivo = 10;
		int enteroPrimitivo2=10;
		
		
		if (enteroPrimitivo==enteroPrimitivo2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		//Integer enteroObjeto2 = new Integer(10);
		Integer enteroObjeto = Integer.valueOf(10);
		Integer enteroObjeto2 = Integer.valueOf(10);
		
		if (enteroObjeto.equals(enteroObjeto2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		if (enteroObjeto==enteroObjeto2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		Usuario usuario1 = new Usuario("Juan", 25);
		Usuario usuario2 = new Usuario("Juan", 25);
		if (usuario1==usuario2) {
			System.out.println("Son el mismo usuario objeto");
		} else {
			System.out.println("No son el mismo usuario objeto");
		}
		if (usuario1.equals(usuario2)) {
			System.out.println("Son el mismo usuario por contenido");
		} else {
			System.out.println("No son el mismo usuario por contenido");
		}
		

	}

}
