package ejem03_ejemploProyectoHerencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/** Tenemos una Persona con Nombre, id generado aleatoriamente,
 *  con un ArrayList de Calificaciones, donde Calificacion se 
 *  compone de nombre de asignatura y nota numérica. La Persona tendrá
 *  la capacidad aprobar todas las asignaturas 
 *  al interfaz Sobornador. La Persona estará matriculada de un 
 *  Curso o de un Seminario, solo uno.
 */
public class Persona implements Sobornador {
	private String nombre;
	private int id;
	private ArrayList<Calificacion> calificaciones;
	private Matricula matricula;
	

	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		Random aleatorios=new Random();
		this.id = aleatorios.nextInt();
		calificaciones=new ArrayList<Calificacion>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(Calificacion... notas) {
		for (Calificacion calificacion : notas) {
			calificaciones.add(calificacion);
		}
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + ", calificaciones=" + calificaciones + "]";
	}
	@Override
	public void sobonar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < calificaciones.size(); i++) {
			calificaciones.get(i).setNotaAsig(5);
		}
	}
	

}
