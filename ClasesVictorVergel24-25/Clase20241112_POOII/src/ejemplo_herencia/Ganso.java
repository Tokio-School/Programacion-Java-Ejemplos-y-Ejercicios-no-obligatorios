package ejemplo_herencia;

public class Ganso extends Animal implements Volador {

	public Ganso(String nombre, int edad) {
		// TODO Auto-generated constructor stub
		super(nombre, edad);
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("El ganso vuela en V");
	}

	@Override
	public String toString() {
		return "Ganso [toString()=" + super.toString() + "]";
	}

	

}
