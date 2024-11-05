
public class Curso {
	
	String nombre;
	int duracion;
	double precio;
	
	Persona alumnosMatriculados[]=new Persona[10];
	
	public Persona[] getAlumnosMatriculados() {
		return alumnosMatriculados;
	}
	public void setAlumnosMatriculados(Persona[] alumnosMatriculados) {
		this.alumnosMatriculados = alumnosMatriculados;
	}
	
	public void anadirAlumnoNuevo(Persona alumno)
	{
		//alumnosMatriculados[alumnosMatriculados.length]=alumno;
		Persona alumnosMatriculadosAux[]=new Persona[alumnosMatriculados.length+1];
		for (int i = 0; i < alumnosMatriculados.length; i++) {
			alumnosMatriculadosAux[i] = alumnosMatriculados[i];
		}
		alumnosMatriculadosAux[alumnosMatriculados.length]=alumno;
		
		for (int i = 0; i < alumnosMatriculadosAux.length; i++) {
			System.out.println("--->"+alumnosMatriculadosAux[i].getNombre());
		}
		alumnosMatriculados=alumnosMatriculadosAux;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + "]";
	}
	public Curso(String nombre, int duracion, double precio) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}
	
	
	public int dameNumeroAlumnos() {
		// TODO Auto-generated method stub
		return alumnosMatriculados.length;
	}
	
	
	
	
	

}
