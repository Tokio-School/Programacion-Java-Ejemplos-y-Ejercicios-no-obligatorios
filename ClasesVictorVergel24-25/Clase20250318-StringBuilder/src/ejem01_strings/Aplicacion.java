package ejem01_strings;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prueba="Hola";
		System.out.println(prueba.hashCode());
		prueba+=" Mundo";
		System.out.println(prueba.hashCode());		
		System.out.println(prueba);
		
		String prueba2="Hola Mundo";
		System.out.println(prueba2.hashCode());		
		System.out.println(prueba2);
		
		if (prueba.equals(prueba2)) {
            System.out.println("Son iguales");
        } else {
        	System.out.println("Son diferentes");
        }

		/*Persona_DeTodaLaVida pepe=new Persona_DeTodaLaVida("Pepe", 30);
		Persona_DeTodaLaVida pepe2=new Persona_DeTodaLaVida("Pepe", 30);
		if (pepe.equals(pepe2)) {
			System.out.println("Personas iguales");
		} else {
			System.out.println("Personas diferentes");
		}*/
		
		Persona pepe=new Persona("Pepe", 30);
		Persona pepe2=new Persona("Pepe", 30);
		System.out.println(pepe);
		if (pepe.equals(pepe2)) {
			System.out.println("Personas iguales");
		} else {
			System.out.println("Personas diferentes");
		}
		

	}

}
