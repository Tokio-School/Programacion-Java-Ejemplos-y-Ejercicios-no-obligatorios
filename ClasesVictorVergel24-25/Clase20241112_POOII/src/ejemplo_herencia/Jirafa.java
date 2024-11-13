package ejemplo_herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



public class Jirafa extends Cuadrupedo {

	
	
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Jirafa(String nombre, int edad) {
		super(nombre, edad);
	}

	/**
	 * 
	 */
	/*public Jirafa() {
		//super();
		System.out.println("Nace una jirafa");
	}*/

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
		//System.out.println("La jirafa come hojas");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		//super.dormir();
		System.out.println("La jirafa duerme de pie");
	}

	@Override
	public String toString() {
		return "Jirafa [nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	
}
