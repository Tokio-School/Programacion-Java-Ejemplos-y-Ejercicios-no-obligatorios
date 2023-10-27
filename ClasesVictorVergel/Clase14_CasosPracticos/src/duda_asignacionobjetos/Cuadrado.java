package duda_asignacionobjetos;

public class Cuadrado extends Poligono {

	public Cuadrado() {
		setNumeroPuntos(4);
	}
	
	@Override
	public void medotoSobreescrito() {
		// TODO Auto-generated method stub
		System.out.println("Soy el método sobreescrito del Cuadrado");
	}
	
	public void girarCuadrado() {
		System.out.println("Cuadrado girado");
	}
	
	/*@Override
	public void mostrarDatosObjecto()
	{
		System.out.println("mensaje de soy un Cuadrado");
	}*/
}
