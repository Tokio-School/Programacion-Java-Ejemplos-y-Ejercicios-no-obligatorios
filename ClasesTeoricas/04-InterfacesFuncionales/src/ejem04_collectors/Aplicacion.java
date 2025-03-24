package ejem04_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> frutas= Arrays.asList("manzana", "manzana","pera","naranja","platano","manzana","naranja","manzana");
		
		List<String> frutas2=frutas.stream().filter(fruta->fruta.length()>4).collect(Collectors.toList());
		System.out.println(frutas2);
		
		Set<String> frutas3=frutas.stream().filter(fruta->fruta.length()>4).collect(Collectors.toSet());
		System.out.println(frutas3);
		
		
		String frutas4=frutas.stream().collect(Collectors.joining(", ", "Frutas: ", "."));
		System.out.println(frutas4);
		
	}

}
