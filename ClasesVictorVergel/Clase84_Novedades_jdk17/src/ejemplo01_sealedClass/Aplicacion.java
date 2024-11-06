package ejemplo01_sealedClass;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura = new Circulo(5);
		figura = new Rectangulo(5.2, 10.2);
		if (figura instanceof Circulo) {
			System.out.println("Es un circulo");
		}else
			System.out.println("Es un rectangulo");
		
	}

}
