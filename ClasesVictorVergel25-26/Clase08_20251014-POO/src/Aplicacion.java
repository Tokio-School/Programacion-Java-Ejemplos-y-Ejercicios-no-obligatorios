
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso java = new Curso("Java", 200, 30);
		Curso javaSinLimiteAlumnoa = new Curso("Java", 200);
		Curso python = new Curso("Python", 200);
		python=java; 
		
		if (java == python) {
			System.out.println("Son el mismo objeto en memoria");
		} else {
			System.out.println("No son el mismo objeto en memoria");
		}
		//python.nombre="Python avanzado";
		python.setNombre("Python avanzado");
		System.out.println(python.getNombre());
		//System.out.println(java.informacionCurso());
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Juan");
		alumno1.setApellido("Perez");
		alumno1.setDni("12345678");
		alumno1.setEdad(20);
		System.out.println(alumno1.getNombre());
		
		Curso curso1 = new Curso("",0,0);
		curso1.setNombre("Java1");
		curso1.setDuracionHoras(100);
		curso1.setCantidadAlumnosMax(20);
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Ana");
		alumno2.setApellido("Gomez");
		alumno2.setDni("87654321");
		alumno2.setEdad(22);
		
		
		python.inscribirAlumno(alumno1);
		python.inscribirAlumno(alumno2);
		//System.out.println(python.toString());
		System.out.println(python);
		
		
	}

}
