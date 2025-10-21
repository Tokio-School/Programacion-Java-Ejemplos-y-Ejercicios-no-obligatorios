package conrecord;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pepe = new Persona("Pepe", 30, "12345678A",1.75);
		System.out.println(pepe.dni());
		System.out.println(pepe.nombre());
		System.out.println(pepe.edad());
		
		Persona ana = new Persona("Ana", 25, "87654321B",1.65);
		//pepe.saludar(ana);
		Persona[] personas = {new Persona("Luis", 40, "11223344C",1.80),
				new Persona("Marta", 35, "44332211D",1.70),
				new Persona("Carlos", 28, "55667788E",1.82)};
		
		/*for(int i=0; i<personas.length; i++) {
			ana.saludar(personas[i]);
		}*/
		for(Persona person : personas) {
			ana.saludar(person);
		}
		
		
	}

}
