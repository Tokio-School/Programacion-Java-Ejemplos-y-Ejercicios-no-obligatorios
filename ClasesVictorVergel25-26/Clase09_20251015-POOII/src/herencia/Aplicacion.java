package herencia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pepe = new Persona("Pepe", 30);
		
		SerVivo serVivo = new SerVivo();
		System.out.println(serVivo.isEstaVivo());
		
		pepe.setEstaVivo(false);
		System.out.println(pepe.isEstaVivo());
		
		
		Animal perro = new Animal();
		System.out.println(perro);
		
		Cuadrupedo caballo = new Cuadrupedo();
		System.out.println(caballo);
		
		System.out.println(serVivo);
	}

}
