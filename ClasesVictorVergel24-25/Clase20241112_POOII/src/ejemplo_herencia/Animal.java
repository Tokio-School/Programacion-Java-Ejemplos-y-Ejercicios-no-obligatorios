package ejemplo_herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Animal {
	
	String nombre;
	int edad;
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * 
	 */
	public Animal() {
		super();
		System.out.println("Nace un animal");
	}

	public void comer() {
		if (this instanceof Jirafa) {
			System.out.println("-->La jirafa come hojas");
		} else {
			System.out.println("-->El animal come");
		}
		//System.out.println("El animal come");
	}

	public void dormir() {
		System.out.println("El animal duerme");
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
