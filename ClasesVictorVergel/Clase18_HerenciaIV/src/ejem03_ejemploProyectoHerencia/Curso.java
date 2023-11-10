package ejem03_ejemploProyectoHerencia;

import java.util.ArrayList;

public class Curso extends Matricula {

	private ArrayList<Asignatura> asignaturas=new ArrayList<Asignatura>();

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura... modulos) {
		for (Asignatura asignatura : modulos) {
			asignaturas.add(asignatura);
		}
	}
	
	
	
}
