
public class Persona<T> implements Comparable<Persona<T>> {
	private String nombre;
	private int edad;
	private T mascota;
	
	
	public T getMascota() {
		return mascota;
	}
	public void setMascota(T mascota) {
		this.mascota = mascota;
	}
	/**
	 * Recupera el valor de nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asigna el valor de nombre
	 * @param nombre se introduce por parámetro el nombre de la personas
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Podremos crear una persona indicando su nombre y su edad
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * Creamos una persona sin inicializar sus atributos
	 */
	public Persona() {
		super();
	}
	@Override
	public int compareTo(Persona<T> o) {
		// TODO Auto-generated method stub
		//return this.edad-o.edad;
		return this.nombre.compareTo(o.nombre);
	}

	
	

}
