package clases_internas;

public class Cuerpo {
	private String nombre;
	private int numeroHuesos;
	private Corazon corazon;
	
	public Cuerpo(String nombre, int numeroHuesos, int latidosCorazon) {
		this.nombre = nombre;
		this.numeroHuesos = numeroHuesos;
		this.corazon = new Corazon(latidosCorazon);
	}

	public Cuerpo(String nombre, int numeroHuesos) {
		this.nombre = nombre;
		this.numeroHuesos = numeroHuesos;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroHuesos() {
		return numeroHuesos;
	}

	public void setNumeroHuesos(int numeroHuesos) {
		this.numeroHuesos = numeroHuesos;
	}

	public Corazon getCorazon() {
		return corazon;
	}

	public void setCorazon(Corazon corazon) {
		this.corazon = corazon;
	}




	@Override
	public String toString() {
		return "Cuerpo [nombre=" + nombre + ", numeroHuesos=" + numeroHuesos + ", corazon=" + corazon + "]";
	}




	public class Corazon {
		private int latidosPorMinuto;
		
		@Override
		public String toString() {
			return "Corazon [latidosPorMinuto=" + latidosPorMinuto + "]";
		}

		public Corazon(int latidos) {
			this.latidosPorMinuto = latidos;
		}
		
	}
}
