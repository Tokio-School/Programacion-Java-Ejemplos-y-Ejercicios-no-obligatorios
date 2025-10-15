import java.util.Arrays;

public class Curso {
	
	private String nombre;
	private int duracionHoras;
	private int cantidadAlumnosMax=10;
	private Alumno[] alumnosInscritos;
	private int alumnosReales=0;
	
	
	public Curso(String nombreCurso, int duracionHorasCurso, int cantidadAlumnosMaxCurso) {
		nombre = nombreCurso;
		duracionHoras = duracionHorasCurso;
		cantidadAlumnosMax = cantidadAlumnosMaxCurso;
		alumnosInscritos = new Alumno[cantidadAlumnosMaxCurso];
	}
	
	public Curso(String nombreCurso, int duracionHorasCurso) {
		nombre = nombreCurso;
		duracionHoras = duracionHorasCurso;
		alumnosInscritos = new Alumno[cantidadAlumnosMax];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(int duracionHoras) {
		if (duracionHoras < 0)
			System.out.println("La duracion no puede ser negativa");
		this.duracionHoras = duracionHoras;
	}

	public int getCantidadAlumnosMax() {
		return cantidadAlumnosMax;
	}

	public void setCantidadAlumnosMax(int cantidadAlumnosMax) {
		this.cantidadAlumnosMax = cantidadAlumnosMax;
	}
	
	public String toString() {
		return "Curso [nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", cantidadAlumnosMax="
				+ cantidadAlumnosMax + ", alumnosInscritos=" + alumnosReales + "]"+
				Arrays.toString(alumnosInscritos);
				
	}
	
	public void inscribirAlumno(Alumno alumno) {
		alumnosInscritos[alumnosReales] = alumno;
		alumnosReales++;
	}
}
