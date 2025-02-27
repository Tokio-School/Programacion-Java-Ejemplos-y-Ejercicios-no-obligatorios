package ejem01_arraylist;

public class Clase<T> implements Comparable<Clase<T>> {
	private String nombre;
	private T valor;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	/**
	 * @param nombre
	 * @param valor
	 */
	public Clase(String nombre, T valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", valor=" + valor + "]";
	}
	@Override
	public int compareTo(Clase<T> claseAComparar) {
		// TODO Auto-generated method stub
		return (((Integer)this.valor)-((Integer)claseAComparar.getValor()));
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.nombre.equals(((Clase<T>)obj).getNombre()) && ((Integer)this.valor)==((Integer)(((Clase<T>)obj).getValor()));
	}
	
	
	
	
	
	

}
