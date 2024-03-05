package ejem01_funcionalidadStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import ejem00_streams.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Persona> personas=Stream.of(
				new Persona("Pedrulos","Rodriguez",12),
				new Persona("Juan","Alonso",22),
				new Persona("Marias","Gutierrez",33)
				);
		long numeroNombresConS=personas
				.filter(person->person.getNombre().contains("s"))
/*				.peek(new Consumer<Persona>() {

					@Override
					public void accept(Persona t) {
						// TODO Auto-generated method stub
						System.out.println(t);
					}
				})*/
				.peek(persona->System.out.println(persona))
				.count();
		/*long numeroNombresConS=personas.filter(new Predicate<Persona>() {

			@Override
			public boolean test(Persona personaje) {
				// TODO Auto-generated method stub
				return personaje.getNombre().contains("s");
			}
		}).count();*/
		System.out.println(numeroNombresConS);
		
		
		/*
		 * No podemos reutilizar la colección
		 * long numeroNombresConU=personas.filter(person->person.getNombre().contains("u")).count();
		System.out.println(numeroNombresConU);*/
		
		
		
		
		
		
		
	}

}
