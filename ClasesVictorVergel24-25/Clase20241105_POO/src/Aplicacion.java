
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Pepe";
		String apellido = "Perez";
		int edad = 20;
		double altura = 1.80;
		
		Persona pepe= new Persona(nombre,55,altura,"Madrid");
		Persona maria= new Persona("María",22,1.75,"Valladolid");
		Persona juan= new Persona("Juan");
		
		pepe.caminar();
		juan.caminar();
		maria.caminar();
		
		juan.setEdad(30);
		juan.setAltura(1.70);
		
		
		Persona alumnos[] = new Persona[3];
		alumnos[0]=pepe;
		alumnos[1]=juan;
		alumnos[2]=maria;
		Persona profesor = new Persona("Victor");
		
		//System.out.println(pepe.getNombre() + " " + pepe.getEdad() + " " + pepe.getAltura() + " " + pepe.getCiudadNacimiento());
		System.out.println(pepe.toString());
		System.out.println(juan.toString());
		
		System.out.println(pepe.saludar(juan));
		
		for (Persona alumno : alumnos) {
			System.out.println(profesor.saludar(alumno));
		}
		
		
	}

}
