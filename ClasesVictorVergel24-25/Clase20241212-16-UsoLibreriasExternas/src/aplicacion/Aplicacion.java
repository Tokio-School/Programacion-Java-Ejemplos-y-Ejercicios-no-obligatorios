package aplicacion;

import org.apache.commons.lang3.StringUtils;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Juan");
		System.out.println(persona);
		StringUtils stringUtils = new StringUtils();
		System.out.println(stringUtils.capitalize("hola me llamo victor"));
		System.out.println(stringUtils.reverse("hola me llamo victor"));
		System.out.println(stringUtils.swapCase("hola me llamo victor"));
		
	}
	

}
