package tokio;

import org.apache.commons.lang3.StringUtils;

public class Aplicacion {

	public static void main(String[] args) {
		System.out.println("Hola Maven");
		System.out.println(StringUtils.capitalize("hola maven con commons-lang3"));
		System.out.println(StringUtils.reverse("hola maven con commons-lang3"));
		
		Persona p = new Persona("Juan Perez",30,"Calle Falsa 123");
		System.out.println(p);
	}
}
