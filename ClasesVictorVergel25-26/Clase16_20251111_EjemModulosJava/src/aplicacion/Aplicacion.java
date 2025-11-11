package aplicacion;

import org.apache.commons.lang3.StringUtils;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Juan", 30);
		System.out.println(p1);
		System.out.println("Nombre: " + p1.getNombre());
		
		
		System.out.println(StringUtils.capitalize("hola Mundo"));
		System.out.println(StringUtils.reverse("hola Mundo"));
		System.out.println(StringUtils.upperCase("hola Mundo"));
		System.out.println(StringUtils.lowerCase("HOLA MUNDO"));
		
		
	}

}
