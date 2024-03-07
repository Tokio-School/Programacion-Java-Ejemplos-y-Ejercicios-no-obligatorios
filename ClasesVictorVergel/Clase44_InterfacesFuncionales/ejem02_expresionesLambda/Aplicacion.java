package ejem02_expresionesLambda;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pepe=new Persona("Pepe");
		pepe.saludar("maria");
		pepe.saludarEfusivamente();
		
		(new Saludador() {

			@Override
			public void saludar(String nombre) {
				// TODO Auto-generated method stub
				System.out.println("hola mundo desde una clase anómima"+nombre);
			}}).saludar("Juan");
		String nombre="Pedro";
		Saludador saludos=(nombreASaludar)->{System.out.println("hola mundo desde lambda"+nombreASaludar);};
		saludos.saludar(nombre);
		saludos.saludarEfusivamente();
		
		
	}

}
