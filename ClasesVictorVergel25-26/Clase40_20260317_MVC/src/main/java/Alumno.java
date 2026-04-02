
public record Alumno(String nombre, double nota) {

	@Override
	public String toString() {
		return nombre + " - " + nota ;
	}
}
