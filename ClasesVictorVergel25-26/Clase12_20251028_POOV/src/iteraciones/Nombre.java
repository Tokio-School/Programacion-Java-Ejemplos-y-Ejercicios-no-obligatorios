package iteraciones;

public class Nombre implements Comparable<Nombre> {
	private String nombre;

	public Nombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int compareTo(Nombre o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}

/*	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.nombre==(((Nombre)obj).getNombre());
	}*/
	
}
