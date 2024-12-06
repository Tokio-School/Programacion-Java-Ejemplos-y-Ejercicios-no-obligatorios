package ejem_interfazFuncional;

public class Tarea {
	private String descripcion;
	private boolean completada;
	/**
	 * @param descripcion
	 * @param completada
	 */
	public Tarea(String descripcion, boolean completada) {
		super();
		this.descripcion = descripcion;
		this.completada = completada;
	}
	@Override
	public String toString() {
		return "Tarea [descripcion=" + descripcion + ", completada=" + completada + "]";
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isCompletada() {
		return completada;
	}
	public void setCompletada(boolean completada) {
		this.completada = completada;
	}
	@Override
	public int hashCode() {
		return descripcion.hashCode()*47;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (this.descripcion.equals(((Tarea)obj).descripcion)) {
			return true;
		}
		return false;
	}



}
