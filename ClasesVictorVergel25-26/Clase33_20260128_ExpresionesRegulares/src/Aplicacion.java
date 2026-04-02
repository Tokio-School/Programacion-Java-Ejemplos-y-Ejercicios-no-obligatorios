
public class Aplicacion {

	public static void main(String[] args) {
		String cadenaTexto="Hola mundo";
		if (cadenaTexto.contains("Hola"))
			System.out.println("La cadena contiene la palabra Hola");
		else
			System.out.println("La cadena no contiene la palabra Hola");
		
		System.out.println("--------\n \n-------------");
		
		String nombre="Óscar Pérez";
		System.out.println(nombre.matches("[A-ZÁÉÍÓÚ][a-za-záéíóú]+ [A-ZÁÉÍÓÚ][a-záéíóú]+"));
		String dni="12345678Z";
		System.out.println(dni.matches("[0-9]{8}[A-Z]"));
		System.out.println(dni.matches("\\d{8}[A-Z]"));	
		String correoElectronico="fernando.garcia@gmail.com";
		System.out.println(correoElectronico.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}"));
		

	}

}
