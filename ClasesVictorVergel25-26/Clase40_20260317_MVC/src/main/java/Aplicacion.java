import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {
		//Alumno alumno = new Alumno("Juan", 8.5);
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno("Juan", 8.5));
		alumnos.add(new Alumno("María", 9.0));
		alumnos.add(new Alumno("Pedro", 7.5));
		alumnos.add(new Alumno("Ana", 9.5));
		Controlador controlador = new Controlador(alumnos);
		Vista vista = new Vista(alumnos,controlador);
		

	}

}
