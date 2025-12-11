package ejem02_utilidadesObjetosDatosPrimitivos;

import java.lang.reflect.Field;

public class Aplicacion {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		Integer numero = Integer.valueOf(12345); // Autoboxing
		Integer numero2 = Integer.valueOf("54321"); // Autoboxing
		Integer numeroBinario = Integer.valueOf("1101", 2); // Autoboxing
		Integer numeroBinario2 = Integer.parseInt("1101", 2); // Autoboxing
		
		System.out.println(numeroBinario+numeroBinario2);
		
		if (numero instanceof Integer) {
			System.out.println("Es un objeto de la clase Integer");
		}
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		
		
		String valor = "12345";
		Integer valorEntero = Integer.parseInt(valor); // Unboxing
		String valor2 = valorEntero.toString(); // Autoboxing
		String valor3 = String.valueOf(valor2); // Autoboxing
		Integer el3=Integer.valueOf(3);
		Integer el5=5;
		System.out.println(el3.getClass().getName());
		
		Usuario usuario = new Usuario("Victor", 30);
		System.out.println(usuario.getClass().getName());
		Field atributosUsuario[]=usuario.getClass().getDeclaredFields();
		for(Field atributo:atributosUsuario) {
			System.out.println(atributo.getName()+" - "+atributo.getType().getName());
		}
		
		
		
		
		

	}

}
