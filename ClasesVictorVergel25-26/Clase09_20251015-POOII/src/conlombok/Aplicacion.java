package conlombok;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pepe = new Persona("Pepe", 30, "12345678A");
		Persona ana=new Persona();
		ana.setNombre("Ana");
	/*	ana.setEdad(25);
		ana.setDni("87654321B");*/
		
		System.out.println(ana);
		
		
	/*	pepe.setNombre("Pepe");
		pepe.setEdad(30);
		pepe.setDni("12345678A");*/
		
	}

}
