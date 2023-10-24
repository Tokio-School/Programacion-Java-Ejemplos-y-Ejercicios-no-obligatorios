package Ejem00_modificadoresAcceso;

public class Coche extends Vehiculo implements Reponsable {
	
	public void acelerar()
	{
		velocidad=velocidad+10;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void repostar() {
		// TODO Auto-generated method stub
		System.out.println("Echo gasolina o cargo en el enchufe");
	}

}
