package ejemplo_herencia;

public class AplicacionZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.comer();
		animal.dormir();
		
		Jirafa jirafa = new Jirafa("Jirafales", 5);
		jirafa.comer();
		jirafa.dormir();
		
		System.out.println(jirafa);
		
		Ganso ganso = new Ganso("Gansi",2);
		ganso.comer();
		ganso.dormir();
		ganso.volar();
		System.out.println(ganso);
		
		
		System.out.println("El número de patas de los cuadrúpedos es: "+Cuadrupedo.NUM_PATAS);
		//System.out.println("El número de patas de los cuadrúpedos es: "+jirafa.numeroPatas);
		
	}

}
