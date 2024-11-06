package ejemplo00_record;

public record Persona(String nombre, int edad) {

	
	public Persona {
		if (edad < 0) {
			throw new IllegalArgumentException("Edad no puede ser negativa");
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this.nombre().equals(((Persona) obj).nombre())) {
			return true;
		}
		return false;
	}
	
	
}
