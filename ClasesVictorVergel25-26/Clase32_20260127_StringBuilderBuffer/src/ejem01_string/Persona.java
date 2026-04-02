package ejem01_string;

public record Persona(String nombre, int edad) {

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
