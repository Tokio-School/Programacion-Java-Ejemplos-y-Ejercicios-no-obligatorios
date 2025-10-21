package conrecord;

public record Persona(String nombre, int edad, String dni,double altura) {
	// Los records no permiten atributos adicionales ni metodos setters
	// Los records son inmutables
	// El constructor, los getters, toString, equals y hashCode se generan automaticamente

	public void saludar(Persona otraPersona) {
		System.out.println("Hola " + otraPersona.nombre() + ", soy " + this);
	}
	
}