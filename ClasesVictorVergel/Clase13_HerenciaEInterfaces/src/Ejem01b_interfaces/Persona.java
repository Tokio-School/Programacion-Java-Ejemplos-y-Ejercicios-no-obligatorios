package Ejem01b_interfaces;

public class Persona implements Deportista, Morible{
	String nombre;
	int edad;
	
	@Override
	public void corre() {
		// TODO Auto-generated method stub
		System.out.println("Corro como las personas");
	}
	@Override
	public void alimentarSano() {
		// TODO Auto-generated method stub
		System.out.println("Como como las personas");
	}
	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
	
}
